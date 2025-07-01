package com.cit.NNS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cit.NNS.Model.CareerGuidanceRequest;
import com.cit.NNS.repository.CareerGuidanceRequestRepository;

@Service
public class CareerGuidanceRequestService {

    @Autowired
    private CareerGuidanceRequestRepository repository;

    public CareerGuidanceRequest saveRequest(CareerGuidanceRequest request) {
        return repository.save(request);
    }
}
