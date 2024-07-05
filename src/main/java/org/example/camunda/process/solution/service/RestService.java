package org.example.camunda.process.solution.service;

import org.example.camunda.process.solution.model.ConditionalBody;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {
    private final RestTemplate restTemplate;

    public RestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ConditionalBody getCondition() {
        String url = "https://mocki.io/v1/69e5c4d3-8fc0-4a10-8d15-2ddc03a735a9";
        return restTemplate.getForObject(url, ConditionalBody.class);
    }
}
