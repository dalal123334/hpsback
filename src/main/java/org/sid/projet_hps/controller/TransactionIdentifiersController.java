package org.sid.projet_hps.controller;

import org.sid.projet_hps.entities.AccountInstitutionInfo;
import org.sid.projet_hps.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/transactions/identifiers")
public class TransactionIdentifiersController {

    @Autowired
    private GenericService transactionService;

    @PostMapping
    public ResponseEntity<?> saveIdentifiers(@RequestBody @Valid AccountInstitutionInfo identifiers) {
        transactionService.saveTransactionIdentifiers(identifiers);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountInstitutionInfo> getIdentifiers(@PathVariable Long id) {
        AccountInstitutionInfo identifiers = transactionService.getTransactionIdentifiers(id);
        return ResponseEntity.ok(identifiers);
    }
}
