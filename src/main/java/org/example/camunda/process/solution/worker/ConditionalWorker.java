package org.example.camunda.process.solution.worker;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.VariablesAsType;
import org.example.camunda.process.solution.variable.TestVariables;
import org.example.camunda.process.solution.service.ConditionalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ConditionalWorker {

    private static final Logger LOG = LoggerFactory.getLogger(TeineWorker.class);

    private final ConditionalService myService;

    public ConditionalWorker(ConditionalService myService) {
        this.myService = myService;
    }

    @JobWorker
    public TestVariables conditionalWorker(@VariablesAsType TestVariables variables) {
        LOG.info("Invoking myService with variables: " + variables);

        return variables.setResult(myService.myOperation(variables.getResult()));
    }
}
