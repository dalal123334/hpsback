package org.sid.projet_hps.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReconciliationInfoDTO {
    private double reconciliationAmount;
    private String reconciliationCurrencyCode;
    private double additionalAmounts;
    private String settlementInformation;
}
