package org.sid.projet_hps.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;


@Entity
@Table(name = "reconciliation_info")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReconciliationInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amountReconciliation;
    private String currencyCodeReconciliation;
    private BigDecimal amountsAdditional;
    private String settlementInformation;
}
