package org.sid.projet_hps.services;

import org.sid.projet_hps.entities.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import java.util.Objects;
import java.util.logging.Logger;

public class IPMFileGenerator {

    private static final Logger logger = Logger.getLogger(IPMFileGenerator.class.getName());
    private static final String HEADER = "J1644€";
    private static final String MESSAGE_TYPE_IDENTIFIER = "1240";

    public static void generateIPMFile(String filePath, Transaction transaction) throws IOException {
        Objects.requireNonNull(filePath, "File path must not be null");
        Objects.requireNonNull(transaction, "Transaction must not be null");

        StringBuilder content = new StringBuilder();

        // Add header
        content.append(HEADER);

        // Add Transaction Info
        TransactionInfo info = transaction.getTransactionInfo();
        content.append(formatField(info.getProcessingCode(), 6))
                .append(formatField(info.getAmountTransaction().toString(), 12))
                .append(formatDate(info.getLocalTransactionDateTime(), "yyMMdd"))
                .append(formatTime(info.getLocalTransactionDateTime(), "HHmmss"))
                .append(formatField(info.getRetrievalReferenceNumber(), 12))
                .append(formatField(info.getApprovalCode(), 6))
                .append(formatField(info.getMessageNumber(), 4))
                .append(formatField(info.getTransactionLifeCycleId(), 16));

        // Add Message Type Identifier
        content.append(MESSAGE_TYPE_IDENTIFIER);

        // Add other fields from TransactionInfo
        content.append(formatField(info.getPrimaryAccountNumber(), 19))
                .append(formatField(info.getProcessingCode(), 6))
                .append(formatAmount(info.getAmountTransaction(), 12))
                .append(formatDate(info.getLocalTransactionDateTime(), "MMddHHmmss"))
                .append(formatDate(info.getExpirationDate(), "YYMM"))
                .append(formatField(info.getPointOfServiceDataCode(), 12))
                .append(formatField(info.getCardSequenceNumber(), 3))
                .append(formatField(info.getFunctionCode(), 3))
                .append(formatField(info.getMessageReasonCode(), 4));

        // Add AcceptorInfo
        AcceptorInfo acceptorInfo = transaction.getAcceptorInfo();
        content.append(formatField(acceptorInfo.getAcceptorBusinessCode(), 4))
                .append(formatField(acceptorInfo.getAcceptorTerminalId(), 8))
                .append(formatField(acceptorInfo.getAcceptorIdCode(), 15))
                .append(formatField(acceptorInfo.getAcceptorNameLocation(), 40))
                .append(formatField(acceptorInfo.getAcceptorStreetAddress(), 25))
                .append(formatField(acceptorInfo.getAcceptorCity(), 13));

        // Add AccountInstitutionInfo
        AccountInstitutionInfo accountInfo = transaction.getAccountInstitutionInfo();
        content.append(formatField(accountInfo.getAcquiringInstitutionIdCode(), 11))
                .append(formatField(accountInfo.getForwardingInstitutionIdCode(), 11));

        // Add CurrencyConversionInfo
        CurrencyConversionInfo currencyInfo = transaction.getCurrencyConversionInfo();
        content.append(formatAmount(currencyInfo.getConversionRateReconciliation(), 8))
                .append(formatAmount(currencyInfo.getConversionRateCardholderBilling(), 8))
                .append(formatDate(currencyInfo.getCurrencyConversionDate(), "MMDD"))
                .append(formatField(currencyInfo.getCurrencyConversionIndicator(), 1));

        // Add ReconciliationInfo
        ReconciliationInfo reconciliationInfo = transaction.getReconciliationInfo();
        content.append(formatAmount(reconciliationInfo.getAmountReconciliation(), 12))
                .append(formatField(reconciliationInfo.getCurrencyCodeReconciliation(), 3))
                .append(formatAmount(reconciliationInfo.getAmountsAdditional(), 12))
                .append(formatField(reconciliationInfo.getSettlementInformation(), 15));

        // Add AdditionalData
        AdditionalData additionalData = transaction.getAdditionalData();
        content.append(formatField(additionalData.getMastercardMappingServiceAccountNumber(), 23))
                .append(formatField(additionalData.getGcmsProductIdentifier(), 4))
                .append(formatField(additionalData.getLicensedProductIdentifier(), 4));
        // ... add other additional data fields as needed

        // Ensure the directory exists
        File file = new File(filePath).getParentFile();
        if (file != null && !file.exists()) {
            file.mkdirs();
        }

        // Write to file
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(content.toString().getBytes(StandardCharsets.UTF_8));
            logger.info("File generated successfully at " + filePath);
        } catch (IOException e) {
            logger.severe("Error writing to file: " + e.getMessage());
            throw e;
        }
    }

    private static String formatField(String value, int length) {
        return String.format("%-" + length + "s", value != null ? value : "").substring(0, length);
    }

    private static String formatAmount(java.math.BigDecimal amount, int length) {
        return String.format("%0" + length + "d", amount.movePointRight(2).longValue());
    }

    private static String formatDate(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }

    private static String formatTime(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }
}