package uz.nodir.jakartavalidation.controller;


import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.nodir.jakartavalidation.dto.card.group.MasterGroup;
import uz.nodir.jakartavalidation.dto.card.group.UzCardGroup;
import uz.nodir.jakartavalidation.dto.card.group.VisaGroup;
import uz.nodir.jakartavalidation.dto.card.request.CardRequestDTO;

import java.io.Reader;

/**
 * @author: Nodir
 * @date: 09.08.2025
 * @group: Meloman
 **/

@Slf4j
@RestController
@RequestMapping("/api/card")
public class CardController {

    @PostMapping("/uzcard")
    public ResponseEntity<String> createUzCard(@RequestBody @Validated(UzCardGroup.class) CardRequestDTO requestDTO) {
        log.info("Received command to create uzCard with request dto: {}", requestDTO);
        return ResponseEntity.ok("Card created successfully");
    }

    @PostMapping("/master")
    public ResponseEntity<String> createMaster(@RequestBody @Validated(MasterGroup.class) CardRequestDTO requestDTO) {
        log.info("Received command to create master with request dto: {}", requestDTO);
        return ResponseEntity.ok("Card created successfully");
    }

    @PostMapping("/visa")
    public ResponseEntity<String> createVisa(@RequestBody @Validated(VisaGroup.class) CardRequestDTO requestDTO) {
        log.info("Received command to create visa with request dto: {}", requestDTO);
        return ResponseEntity.ok("Card created successfully");
    }
}
