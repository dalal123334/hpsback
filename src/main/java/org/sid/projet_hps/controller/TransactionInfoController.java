package org.sid.projet_hps.controller;

import org.sid.projet_hps.entities.TransactionInfo;
import org.sid.projet_hps.services.TransactionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/transaction-info")
public class TransactionInfoController {

    private final TransactionInfoService transactionInfoService;

    @Autowired
    public TransactionInfoController(TransactionInfoService transactionInfoService) {
        this.transactionInfoService = transactionInfoService;
    }

    @PostMapping
    public ResponseEntity<TransactionInfo> createTransactionInfo(@RequestBody TransactionInfo transactionInfo) {
        return ResponseEntity.ok(transactionInfoService.save(transactionInfo));
    }


}
