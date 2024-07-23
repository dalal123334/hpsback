package org.sid.projet_hps.controller;


import org.sid.projet_hps.entities.ReconciliationInfo;
import org.sid.projet_hps.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/transactions/values")
public class TransactionValuesController {

    @Autowired
    private GenericService transactionService;

    @PostMapping
    public ResponseEntity<?> saveValues(@RequestBody @Valid ReconciliationInfo values) {
        transactionService.saveTransactionValues(values);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReconciliationInfo> getValues(@PathVariable Long id) {
        ReconciliationInfo values = transactionService.getTransactionValues(id);
        return ResponseEntity.ok(values);
    }
}
