package org.example.camunda.process.solution.worker;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.VariablesAsType;
import org.example.camunda.process.solution.variable.TehikProcessVariables;
import org.springframework.stereotype.Component;

@Component
public class ProcessProceeding {
    @JobWorker
    public TehikProcessVariables processProceeding(@VariablesAsType TehikProcessVariables variables) {
        return variables;
    }
}
