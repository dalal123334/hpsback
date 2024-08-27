package org.sid.projet_hps.controller;

import org.sid.projet_hps.services.IPMFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

@RestController
@RequestMapping("/api/ipm")
public class IPMFileController {

    @Autowired
    IPMFileService ipmFileService;

   private  static int transactionId = 0;

    @GetMapping("/downloadIPM")
    public ResponseEntity<InputStreamResource> downloadIPMFile() {
        try {
            InputStreamResource fileContent = ipmFileService.generateIPMFile();

            HttpHeaders headers = new HttpHeaders();
            ++transactionId;
            headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=IPM_" + transactionId + ".ipm");

            return ResponseEntity.ok()
                    .headers(headers)
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .body(fileContent);
        } catch (IOException ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error generating IPM file", ex);
        }
    }

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<String> handleResponseStatusException(ResponseStatusException ex) {
        return ResponseEntity.status(ex.getStatusCode()).body(ex.getReason());
    }
}