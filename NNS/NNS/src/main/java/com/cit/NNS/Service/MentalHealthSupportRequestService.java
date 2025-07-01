package com.cit.NNS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cit.NNS.Model.MentalHealthSupportRequest;
import com.cit.NNS.repository.MentalHealthSupportRequestRepository;

@Service
public class MentalHealthSupportRequestService {

    @Autowired
    private MentalHealthSupportRequestRepository repository;

    public MentalHealthSupportRequest saveRequest(MentalHealthSupportRequest request) {
        return repository.save(request);
    }
}
