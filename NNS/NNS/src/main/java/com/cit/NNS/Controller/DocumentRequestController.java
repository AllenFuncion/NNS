package com.cit.NNS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cit.NNS.Model.DocumentRequest;
import com.cit.NNS.repository.DocumentRequestRepository;

@RestController
@RequestMapping("/api/document-requests")
public class DocumentRequestController {

    @Autowired
    private DocumentRequestRepository repository;

    @PostMapping
    public ResponseEntity<?> createRequest(@RequestBody DocumentRequest request) {
        repository.save(request);
        return ResponseEntity.ok().build();
    }
}
