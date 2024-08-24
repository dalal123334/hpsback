package org.sid.projet_hps.controller;

import jakarta.validation.Valid;
import org.sid.projet_hps.entities.AcceptorInfo;
import org.sid.projet_hps.entities.CurrencyConversionInfo;
import org.sid.projet_hps.services.CurrencyConversionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions/merchant-info")
public class CurrencyConversionInfoController {

    @Autowired
    private CurrencyConversionInfoService transactionService;

    @PostMapping
    public ResponseEntity<CurrencyConversionInfo> saveMerchantInfo(@RequestBody @Valid CurrencyConversionInfo currencyConversionInfo) {
        return ResponseEntity.ok().body(transactionService.save(currencyConversionInfo));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AcceptorInfo> getMerchantInfo(@PathVariable Long id) {
        AcceptorInfo merchantInfo = transactionService.getTransactionMerchantInfo(id);
        return ResponseEntity.ok(merchantInfo);
    }
}
