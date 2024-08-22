

package org.sid.projet_hps.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;


import java.math.BigDecimal;
import java.util.Date;

// TransactionBaseInfo.java
@Entity
@Table(name = "transaction_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TransactionInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String primaryAccountNumber; // Field 2: Primary Account Number (PAN)
    @NotNull
    private String processingCode; // Field 3: Processing Code
    @NotNull
    private BigDecimal amountTransaction; // Field 4: Amount, Transaction
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date localTransactionDateTime; // Field 12: Date and Time, Local Transaction
    @Temporal(TemporalType.DATE)
    private Date expirationDate; // Field 14: Date, Expiration
    @NotNull
    private String pointOfServiceDataCode; // Field 22: Point of Service Data Code
    @NotNull
    private String cardSequenceNumber; // Field 23: Card Sequence Number
    @NotNull
    private String functionCode; // Field 24: Function Code
    @NotNull
    private String messageReasonCode; // Field 25: Message Reason Code
    @NotNull
    private BigDecimal amountsOriginal; // Field 30: Amounts, Original
    @NotNull
    private String retrievalReferenceNumber; // Field 37: Retrieval Reference Number
    @NotNull
    private String approvalCode; // Field 38: Approval Code
    @NotNull
    private String serviceCode; // Field 40: Service Code
    @NotNull
    private String acceptorTerminalId; // Field 41: Acceptor Terminal ID
    @NotNull
    private String acceptorIdCode; // Field 42: Acceptor ID Code
    @NotNull
    private String acceptorNameLocation; // Field 43: Acceptor Name/Location
    @NotNull
    private String currencyCodeTransaction; // Field 49: Currency Code, Transaction
    @Lob
    private String iccSystemRelatedData; // Field 55: Integrated Circuit Card (ICC) System Related Data
    @NotNull
    private String transactionLifeCycleId; // Field 63: Transaction Life Cycle ID
    @NotNull
    private String messageNumber; // Field 71: Message Number
    @NotNull
    private String transactionDestinationInstitutionIdCode; // Field 93: Transaction Destination Institution ID Code

    public String getMessageTypeIdentifier(){
        return null; // Implement this method based on your requirements
    }

    public String getBitMapPrimary(){
        return null; // Implement this method based on your requirements
    }

    public TransactionInfo getTransactionInfo() {
        return null;
    }

    public AcceptorInfo getAcceptorInfo() {
        return null;
    }

    public AccountInstitutionInfo getAccountInstitutionInfo() {return null;
    }

    public CurrencyConversionInfo getCurrencyConversionInfo() {return null;
    }

    public ReconciliationInfo getReconciliationInfo() {
        return null;
    }

    public AdditionalData getAdditionalData() {
        return null;
    }
}




