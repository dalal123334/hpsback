package org.sid.projet_hps.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyConversionInfoDTO {
    private double reconciliationConversionRate;
    private double cardholderBillingConversionRate;
    private String currencyConversionDate;
    private String currencyConversionIndicator;
    private double cardholderBillingAmountUSD;
    private double currencyConversionAssessmentAmountUSD;
}

