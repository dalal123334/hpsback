package org.sid.projet_hps.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class MyRestController {
    @GetMapping("/greet")
    public ResponseEntity<String> greet() {
        return ResponseEntity.ok("Hello, World!");
    }

    @PostMapping("/submit")
    public ResponseEntity<String> submitData(@RequestBody String data) {
        return ResponseEntity.ok("Data received: " + data);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateData(@PathVariable("id") Long id, @RequestBody String newData) {
        // Logique pour mettre à jour les données avec l'ID spécifié
        return ResponseEntity.ok("Data updated with ID: " + id);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteData(@PathVariable("id") Long id) {
        return ResponseEntity.ok("Data deleted with ID: " + id);
    }
    @GetMapping("/search")
    public ResponseEntity<String> search(@RequestParam(name = "query", defaultValue = "default") String query) {
        return ResponseEntity.ok("Search results for: " + query);
    }
}
