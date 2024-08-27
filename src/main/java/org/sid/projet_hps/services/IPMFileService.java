package org.sid.projet_hps.services;


import org.sid.projet_hps.entities.Transaction;
import org.sid.projet_hps.entities.TransactionInfo;
import org.sid.projet_hps.repositories.TransactionInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Component
public class IPMFileService {

    @Autowired
    private TransactionService transactionService;

    public InputStreamResource generateIPMFile() throws IOException {
        Transaction transaction = transactionService.getLastTransaction().orElseThrow(() -> new RuntimeException("Transaction not found"));

        String fileName = "IPM_" + transaction.getId() + ".ipm";
        String filePath = "src/main/resources/temp/" + fileName;

        IPMFileGenerator.generateIPMFile(filePath, transaction);

        Path path = Paths.get(filePath);

        InputStreamResource fileContent = new InputStreamResource(Files.newInputStream(path));
        Files.delete(path);  // Delete the temporary file

        return fileContent;
    }
}

