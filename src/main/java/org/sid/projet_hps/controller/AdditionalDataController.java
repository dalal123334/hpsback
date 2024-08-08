package org.sid.projet_hps.controller;


import org.sid.projet_hps.entities.AdditionalData;
import org.sid.projet_hps.services.AdditionalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/additional-data")
public class AdditionalDataController {

    @Autowired
    private AdditionalDataService additionalDataService;

    @GetMapping
    public ResponseEntity<List<AdditionalData>> getAll() {
        return ResponseEntity.ok(additionalDataService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdditionalData> getById(@PathVariable Long id) {
        Optional<AdditionalData> additionalData = additionalDataService.getById(id);
        return additionalData.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AdditionalData> create(@RequestBody AdditionalData additionalData) {
        return ResponseEntity.ok(additionalDataService.save(additionalData));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AdditionalData> update(@PathVariable Long id, @RequestBody AdditionalData additionalData) {
        if (!additionalDataService.getById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        additionalData.setId(id);
        return ResponseEntity.ok(additionalDataService.save(additionalData));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!additionalDataService.getById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        additionalDataService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
