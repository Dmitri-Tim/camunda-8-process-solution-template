package org.example.camunda.process.solution.service;

import org.example.camunda.process.solution.model.ConditionalBody;
import org.springframework.stereotype.Service;

@Service
public class EsimeneService {

    private RestService restService;

    public EsimeneService(RestService restService) {
        this.restService = restService;
    }

    public boolean getCondition(String previousResult) {
        ConditionalBody body = restService.getCondition();

        return body.isCondition();
    }
}
