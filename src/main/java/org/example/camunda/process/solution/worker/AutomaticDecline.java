package org.example.camunda.process.solution.worker;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.VariablesAsType;
import org.example.camunda.process.solution.variable.TehikProcessVariables;
import org.springframework.stereotype.Component;

@Component
public class AutomaticDecline {
    @JobWorker
    public TehikProcessVariables declineAutomatically(@VariablesAsType TehikProcessVariables variables) {
        return variables;
    }
}
