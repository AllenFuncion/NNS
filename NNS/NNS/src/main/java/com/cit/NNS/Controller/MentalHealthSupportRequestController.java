package com.cit.NNS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cit.NNS.Model.MentalHealthSupportRequest;
import com.cit.NNS.Service.MentalHealthSupportRequestService;

@RestController
@RequestMapping("/api/mental-health-support")
@CrossOrigin(origins = "*")
public class MentalHealthSupportRequestController {

    @Autowired
    private MentalHealthSupportRequestService service;

    @PostMapping
    public ResponseEntity<String> requestSupport(@RequestBody MentalHealthSupportRequest request) {
        service.saveRequest(request);
        return ResponseEntity.ok("Support request successfully submitted.");
    }
}
