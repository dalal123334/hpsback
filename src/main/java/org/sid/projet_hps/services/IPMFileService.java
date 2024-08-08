package org.sid.projet_hps.services;
import org.sid.projet_hps.entities.Transaction;
import org.sid.projet_hps.entities.TransactionInfo;
import org.sid.projet_hps.repositories.TransactionInfoRepository;
import org.sid.projet_hps.controller.IPMFileGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IPMFileService {

private TransactionInfoRepository transactionInfoRepository;

    public byte[] generateIPMFile(Long transactionId) throws IOException {
        TransactionInfo transaction = transactionInfoRepository.findById( transactionId)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));

        String fileName = "IPM_" + transactionId + ".ipm";
        String filePath = "temp/" + fileName;

        IPMFileGenerator.generateIPMFile(filePath, transaction);

        Path path = Paths.get(filePath);
        byte[] fileContent = Files.readAllBytes(path);
        Files.delete(path);  // Delete the temporary file

        return fileContent;
    }
}

