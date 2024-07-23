package org.sid.projet_hps.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
@Entity
@Table (name = "transaction")
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transaction_info_id", referencedColumnName = "id")
    private TransactionInfo transactionInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_institution_info_id", referencedColumnName = "id")
    private AccountInstitutionInfo accountInstitutionInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "acceptor_info_id", referencedColumnName = "id")
    private AcceptorInfo acceptorInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "currency_conversion_info_id", referencedColumnName = "id")
    private CurrencyConversionInfo currencyConversionInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reconciliation_info_id", referencedColumnName = "id")
    private ReconciliationInfo reconciliationInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "additional_data_id", referencedColumnName = "id")
    private AdditionalData additionalData;




}

