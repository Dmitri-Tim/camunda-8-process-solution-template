package org.example.camunda.process.solution.worker;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.VariablesAsType;
import org.example.camunda.process.solution.variable.TehikProcessVariables;
import org.springframework.stereotype.Component;

@Component
public class AutomaticAccept {
    @JobWorker
    public TehikProcessVariables acceptAutomatically(@VariablesAsType TehikProcessVariables variables) {
        return variables;
    }
}
