package org.example.camunda.process.solution.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {
    private static final String baseUrl = "http://10.10.18.29:8083/api/config";
    private final RestTemplate restTemplate;

    public RestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Integer getMinNumber() {
        return restTemplate.getForObject(baseUrl + "/minValue", Integer.class);
    }

    public Integer getMaxNumber() {
        return restTemplate.getForObject(baseUrl + "/maxValue", Integer.class);
    }

}
