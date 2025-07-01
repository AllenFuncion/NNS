package com.cit.NNS.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cit.NNS.Model.Enrollment;
import com.cit.NNS.Service.EnrollmentService;

@RestController
@RequestMapping("/api/enrollments")
@CrossOrigin(origins = "*")
public class EnrollmentController {

    @Autowired
    private EnrollmentService service;

    @PostMapping
    public ResponseEntity<String> enroll(@RequestBody Enrollment enrollment) {
        service.saveEnrollment(enrollment);
        return ResponseEntity.ok("Enrollment successful");
    }
}
