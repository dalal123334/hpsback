package org.sid.projet_hps.controller;

import org.sid.projet_hps.entities.AccountInstitutionInfo;
import org.sid.projet_hps.services.AccountInstitutionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/account-institution-info")
public class AccountInstitutionInfoController {

    @Autowired
    private AccountInstitutionInfoService accountInstitutionInfoService;

    @GetMapping
    public ResponseEntity<List<AccountInstitutionInfo>> getAll() {
        return ResponseEntity.ok(accountInstitutionInfoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountInstitutionInfo> getById(@PathVariable Long id) {
        Optional<AccountInstitutionInfo> accountInstitutionInfo = accountInstitutionInfoService.getById(id);
        return accountInstitutionInfo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AccountInstitutionInfo> create(@RequestBody AccountInstitutionInfo accountInstitutionInfo) {
        return ResponseEntity.ok(accountInstitutionInfoService.save(accountInstitutionInfo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AccountInstitutionInfo> update(@PathVariable Long id, @RequestBody AccountInstitutionInfo accountInstitutionInfo) {
        if (!accountInstitutionInfoService.getById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        accountInstitutionInfo.setId(id);
        return ResponseEntity.ok(accountInstitutionInfoService.save(accountInstitutionInfo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!accountInstitutionInfoService.getById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        accountInstitutionInfoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
