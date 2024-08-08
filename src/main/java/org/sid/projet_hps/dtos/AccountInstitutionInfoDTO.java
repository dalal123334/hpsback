package org.sid.projet_hps.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountInstitutionInfoDTO {
    private String acquiringInstitutionIdCode;
    private String forwardingInstitutionIdCode;
}
