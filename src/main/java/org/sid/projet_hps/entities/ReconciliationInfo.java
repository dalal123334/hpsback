package org.sid.projet_hps.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;


@Entity
@Table(name = "reconciliation_info")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ReconciliationInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amountReconciliation;
    private String currencyCodeReconciliation;
    private BigDecimal amountsAdditional;
    private String settlementInformation;
}
