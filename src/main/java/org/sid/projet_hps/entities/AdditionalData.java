package org.sid.projet_hps.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "additional_data")
@NoArgsConstructor
@AllArgsConstructor
public class AdditionalData {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String mastercardMappingServiceAccountNumber; // Field p0001: Mastercard® Mapping Service Account Number
    private String gcmsProductIdentifier; // Field p0002: GCMS Product Identifier
    private String licensedProductIdentifier; // Field p0003: Licensed Product Identifier
    private String fundingAccountInformation; // Field p0004: Funding Account Information
    private String messageErrorIndicator; // Field p0005: Message Error Indicator
    private String digitalAccountReferenceNumber; // Field p0014: Digital Account Reference Number
    private String clearingCurrencyConversionIdentifier; // Field p0015: Clearing Currency Conversion Identifier
    private String transactionIntegrityClass; // Field p0017: Transaction Integrity Class
    private String acceptanceData; // Field p0018: Acceptance Data
    private String digitalCommerceSolutionsIndicators; // Field p0020: Digital Commerce Solutions Indicators
    private String transactionTypeIndicator; // Field p0021: Transaction Type Indicator
    private String additionalTerminalOperatingEnvironments; // Field p0022: Additional Terminal Operating Environments
    private String terminalType; // Field p0023: Terminal Type
    private String messageReversalIndicator; // Field p0025: Message Reversal Indicator
    private String flexCode; // Field p0027: Flex Code
    private String mpqrReceivingAccountNumber; // Field p0028: Mastercard Merchant Presented (MPQR) Receiving Account Number
    private String qrDynamicCodeData; // Field p0029: QR Dynamic Code Data
    private String transactionTypeIdentifier; // Field p0043: Transaction Type Identifier
    private String programParticipationIndicator; // Field p0044: Program Participation Indicator
    private String mastercardGeneratedInstallmentIdentifier; // Field p0045: Mastercard Generated Installment Identifier
    private String japanCommonMerchantCode; // Field p0046: Japan Common Merchant Code
    private String electronicCommerceSecurityLevelIndicator; // Field p0052: Electronic Commerce Security Level Indicator
    private String mastercardElectronicCardIndicator; // Field p0056: Mastercard Electronic Card Indicator
    private String transactionCategoryIndicator; // Field p0057: Transaction Category Indicator
    private String tokenAssuranceLevel; // Field p0058: Token Assurance Level
    private String tokenRequestorId;
}
