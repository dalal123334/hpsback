package com.example.transactionapp.controller;

import org.sid.projet_hps.entities.CurrencyConversionInfo;
import org.sid.projet_hps.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/transactions/type-info")
public class TransactionTypeInfoController {

    @Autowired
    private GenericService transactionService;

    @PostMapping
    public ResponseEntity<?> saveTypeInfo(@RequestBody @Valid CurrencyConversionInfo typeInfo) {
        transactionService.saveTransactionTypeInfo(typeInfo);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CurrencyConversionInfo> getTypeInfo(@PathVariable Long id) {
        CurrencyConversionInfo typeInfo = transactionService.getTransactionTypeInfo(id);
        return ResponseEntity.ok(typeInfo);
    }
}
