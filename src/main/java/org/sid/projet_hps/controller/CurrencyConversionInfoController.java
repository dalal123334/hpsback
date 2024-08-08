package org.sid.projet_hps.controller;

import org.sid.projet_hps.entities.AcceptorInfo;
import org.sid.projet_hps.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/transactions/merchant-info")
public class CurrencyConversionInfoController {

    @Autowired
    private GenericService transactionService;

    @PostMapping
    public ResponseEntity<?> saveMerchantInfo(@RequestBody @Valid AcceptorInfo merchantInfo) {
        transactionService.saveTransactionMerchantInfo(merchantInfo);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AcceptorInfo> getMerchantInfo(@PathVariable Long id) {
        AcceptorInfo merchantInfo = transactionService.getTransactionMerchantInfo(id);
        return ResponseEntity.ok(merchantInfo);
    }
}
