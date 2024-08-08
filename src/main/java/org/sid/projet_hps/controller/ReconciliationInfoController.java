package com.example.transactionapp.controller;

import org.sid.projet_hps.entities.ReconciliationInfo;
import org.sid.projet_hps.services.ReconciliationInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reconciliation-info")
public class ReconciliationInfoController {

    @Autowired
    private ReconciliationInfoService reconciliationInfoService;

    @GetMapping
    public ResponseEntity<List<ReconciliationInfo>> getAll() {
        return ResponseEntity.ok(reconciliationInfoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReconciliationInfo> getById(@PathVariable Long id) {
        Optional<ReconciliationInfo> reconciliationInfo = reconciliationInfoService.getById(id);
        return reconciliationInfo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ReconciliationInfo> create(@RequestBody ReconciliationInfo reconciliationInfo) {
        return ResponseEntity.ok(reconciliationInfoService.save(reconciliationInfo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReconciliationInfo> update(@PathVariable Long id, @RequestBody ReconciliationInfo reconciliationInfo) {
        if (!reconciliationInfoService.getById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        reconciliationInfo.setId(id);
        return ResponseEntity.ok(reconciliationInfoService.save(reconciliationInfo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!reconciliationInfoService.getById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        reconciliationInfoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
