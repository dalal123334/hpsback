package org.sid.projet_hps.controller;

import org.sid.projet_hps.entities.TransactionInfo;
import org.sid.projet_hps.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/transactions/base-info")
public class TransactionBaseInfoController {

    @Autowired
    private GenericService transactionService;

    @PostMapping
    public ResponseEntity<?> saveBaseInfo(@RequestBody @Valid TransactionInfo baseInfo) {
        transactionService.saveTransactionBaseInfo(baseInfo);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransactionInfo> getBaseInfo(@PathVariable Long id) {
        TransactionInfo baseInfo = transactionService.getTransactionBaseInfo(id);
        return ResponseEntity.ok(baseInfo);
    }
}
