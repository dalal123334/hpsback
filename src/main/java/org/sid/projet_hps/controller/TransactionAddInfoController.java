package org.sid.projet_hps.controller;

import org.sid.projet_hps.entities.Transaction;
import org.sid.projet_hps.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/transactions/add-info")
public class TransactionAddInfoController {

    @Autowired
    private GenericService transactionService;

    @PostMapping
    public ResponseEntity<?> saveAddInfo(@RequestBody @Valid Transaction addInfo) {
        transactionService.saveTransactionAddInfo(addInfo);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> getAddInfo(@PathVariable Long id) {
        Transaction addInfo = transactionService.getTransactionAddInfo(id);
        return ResponseEntity.ok(addInfo);
    }
}
