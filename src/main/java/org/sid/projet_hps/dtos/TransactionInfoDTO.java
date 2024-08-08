package org.sid.projet_hps.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionInfoDTO {
    private String primaryAccountNumber;
    private String processingCode;
    private double transactionAmount;
    private String localTransactionDateTime;
    private String expirationDate;
    private String pointOfServiceDataCode;
    private String cardSequenceNumber;
    private String functionCode;
    private String messageReasonCode;
    private double originalAmount;
    private String retrievalReferenceNumber;
    private String approvalCode;
    private String serviceCode;
    private String acceptorTerminalId;
    private String acceptorIdCode;
    private String acceptorNameLocation;
    private String transactionCurrencyCode;
    private String iccSystemRelatedData;
    private String transactionLifeCycleId;
    private String messageNumber;
    private String transactionDestinationInstitutionIdCode;
}
