package org.sid.projet_hps.controller;

import jakarta.validation.Valid;
import lombok.Getter;
import lombok.Setter;
import org.sid.projet_hps.entities.AcceptorInfo;
import org.sid.projet_hps.entities.TransactionInfo;
import org.sid.projet_hps.services.AcceptorInfoService;
import org.sid.projet_hps.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Getter
@Setter
@RequestMapping("/api/transactions/base-info")
public class AcceptorInfoController {

    @Qualifier("acceptorInfoServiceImpl")
    @Autowired
    private AcceptorInfoService transactionService;

    @PostMapping
    public ResponseEntity<?> saveBaseInfo(@RequestBody @Valid AcceptorInfo baseInfo) {
        //transactionService.save(baseInfo);
        System.out.println(baseInfo);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AcceptorInfo> getBaseInfo(@PathVariable Long id) {
        AcceptorInfo baseInfo = transactionService.getById(id).orElse(null);
        return ResponseEntity.ok(baseInfo);
    }
}
