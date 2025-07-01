package com.cit.NNS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cit.NNS.Model.CareerGuidanceRequest;
import com.cit.NNS.Service.CareerGuidanceRequestService;

@RestController
@RequestMapping("/api/career-guidance")
@CrossOrigin(origins = "*")
public class CareerGuidanceRequestController {

    @Autowired
    private CareerGuidanceRequestService service;

    @PostMapping
    public ResponseEntity<String> bookSession(@RequestBody CareerGuidanceRequest request) {
        service.saveRequest(request);
        return ResponseEntity.ok("Session booked successfully");
    }
}
