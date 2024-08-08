package org.sid.projet_hps.controller;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "transaction_info")
@AllArgsConstructor
@NoArgsConstructor
public class TransactionInfoController {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    private String primaryAccountNumber; // Field 2: Primary Account Number (PAN)
    private String processingCode; // Field 3: Processing Code
    private BigDecimal amountTransaction; // Field 4: Amount, Transaction
    @Temporal(TemporalType.TIMESTAMP)
    private Date localTransactionDateTime; // Field 12: Date and Time, Local Transaction
    @Temporal(TemporalType.DATE)
    private Date expirationDate; // Field 14: Date, Expiration
    private String pointOfServiceDataCode; // Field 22: Point of Service Data Code
    private String cardSequenceNumber; // Field 23: Card Sequence Number
    private String functionCode; // Field 24: Function Code
    private String messageReasonCode; // Field 25: Message Reason Code
    private BigDecimal amountsOriginal; // Field 30: Amounts, Original
    private String retrievalReferenceNumber; // Field 37: Retrieval Reference Number
    private String approvalCode; // Field 38: Approval Code
    private String serviceCode; // Field 40: Service Code
    private String acceptorTerminalId; // Field 41: Acceptor Terminal ID
    private String acceptorIdCode; // Field 42: Acceptor ID Code
    private String acceptorNameLocation; // Field 43: Acceptor Name/Location
    private String currencyCodeTransaction; // Field 49: Currency Code, Transaction
    @Lob
    private String iccSystemRelatedData; // Field 55: Integrated Circuit Card (ICC) System Related Data
    private String transactionLifeCycleId; // Field 63: Transaction Life Cycle ID
    private String messageNumber; // Field 71: Message Number
    private String transactionDestinationInstitutionIdCode; // Field 93: Transaction Destination Institution ID Code


}
