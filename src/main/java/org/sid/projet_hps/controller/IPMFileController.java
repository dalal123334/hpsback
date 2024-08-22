package org.sid.projet_hps.controller;
import org.sid.projet_hps.services.IPMFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/ipm")
public class IPMFileController {

    @Autowired
    private IPMFileService ipmFileService;

    @GetMapping("/generate/{transactionId}")
    public ResponseEntity<byte[]> generateIPMFile(@PathVariable Long transactionId) {
        try {
            byte[] fileContent = ipmFileService.generateIPMFile(transactionId);

            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=IPM_" + transactionId + ".ipm")
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .body(fileContent);
        } catch (IOException e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
