package org.sid.projet_hps.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "currency_conversion_info")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CurrencyConversionInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal conversionRateReconciliation;
    private BigDecimal conversionRateCardholderBilling;
    @Temporal(TemporalType.DATE)
    private Date currencyConversionDate;
    private String currencyConversionIndicator;
    private BigDecimal amountCardholderBillingUSD;
    private BigDecimal amountCurrencyConversionAssessmentUSD;

}
