package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "Account number cannot be null or empty")
    @Pattern(regexp = "^\\d{10}$", message = "Account number must be 10 digits")
    @Schema(
            description = "Account number of Eazy Bank account",
            example = "1234567890"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account type cannot be null or empty")
    @Schema(
            description = "Account type of Eazy Bank account",
            example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "Branch address cannot be null or empty")
    @Schema(
            description = "Branch address of Eazy Bank account",
            example = "123 Main St, Anytown, USA"
    )
    private String branchAddress;
}
