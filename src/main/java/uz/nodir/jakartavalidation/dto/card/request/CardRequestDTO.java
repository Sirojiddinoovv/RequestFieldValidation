package uz.nodir.jakartavalidation.dto.card.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.nodir.jakartavalidation.dto.card.group.MasterGroup;
import uz.nodir.jakartavalidation.dto.card.group.ProcessingGroup;
import uz.nodir.jakartavalidation.dto.card.group.UzCardGroup;
import uz.nodir.jakartavalidation.dto.card.group.VisaGroup;

/**
 * @author: Nodir
 * @date: 09.08.2025
 * @group: Meloman
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardRequestDTO {

    @NotBlank(groups = {VisaGroup.class, MasterGroup.class}, message = "Card field is required")
    @Pattern(regexp = "^\\d{16}$", groups = {VisaGroup.class, MasterGroup.class}, message = "Card must be consist from 16 digits")
    private String card;

    @NotBlank(groups = ProcessingGroup.class, message = "Expiry field is required")
    @Pattern(regexp = "^\\d{4}$", groups = ProcessingGroup.class, message = "Expiry must be consist from 4 digits")
    private String expiry;

    @NotBlank(groups = UzCardGroup.class, message = "Token field is required")
    private String token;

    @NotBlank(groups = VisaGroup.class, message = "CVV field is required for VISA")
    @Pattern(regexp = "^\\d{3}$", groups = VisaGroup.class, message = "CVV must be consist from 3 digits")
    private String cvv;

    @NotBlank(groups = MasterGroup.class, message = "CVC field is required for Master")
    @Pattern(regexp = "^\\d{3}$", groups = MasterGroup.class, message = "CVC must be consist from 3 digits")
    private String cvc;

}
