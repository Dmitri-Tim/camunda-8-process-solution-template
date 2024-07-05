package org.example.camunda.process.solution.service;

import org.springframework.stereotype.Service;

@Service
public class ConditionalService {

    public String myOperation(String previousResult) {
        return previousResult + "Spanish Inquisition";
    }
}
