package org.example.camunda.process.solution.worker;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.VariablesAsType;
import org.example.camunda.process.solution.service.RestService;
import org.example.camunda.process.solution.variable.TehikProcessVariables;
import org.springframework.stereotype.Component;

@Component
public class FetchValuesWorker {
    private final RestService restService;

    public FetchValuesWorker(RestService restService) {
        this.restService = restService;
    }

    @JobWorker
    public TehikProcessVariables fetchValues(@VariablesAsType TehikProcessVariables variables) {
        Integer minNumber = restService.getMinNumber();
        Integer maxNumber = restService.getMaxNumber();

        return variables
                .setMinNumber(minNumber)
                .setMaxNumber(maxNumber);
    }
}
