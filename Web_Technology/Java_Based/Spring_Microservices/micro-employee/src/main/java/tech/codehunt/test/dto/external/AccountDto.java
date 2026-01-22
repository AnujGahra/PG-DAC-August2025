package tech.codehunt.test.dto.external;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {

    @NotBlank(message = "Account number cannot be empty or blank")
    @Pattern(regexp = "\\d{16}", message = "Account number must be exactly 16 digits")
    private String accNo;

    @NotBlank(message = "Bank Name cannot be empty or blank")
    @Size(min = 2, max = 50, message = "Bank Name must be between 2 to 50 chars")
    private String bankName;

    @NotBlank(message = "IFSC cannot be empty or blank")
    private String ifsc;

    @NotBlank(message = "Address cannot be empty or blank")
    @Size(min = 5, max = 300, message = "Address must be between 5 to 300 chars")
    private String address;

    @NotBlank(message = "Employee ID cannot be empty or blank")
    private String employeeId;
}
