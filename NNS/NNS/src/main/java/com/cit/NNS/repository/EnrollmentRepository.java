package com.cit.NNS.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cit.NNS.Model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
