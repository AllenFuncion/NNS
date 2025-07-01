package com.cit.NNS.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cit.NNS.Model.Enrollment;
import com.cit.NNS.repository.EnrollmentRepository;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository repository;

    public Enrollment saveEnrollment(Enrollment enrollment) {
        return repository.save(enrollment);
    }
}
