package org.example.camunda.process.solution.worker;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.VariablesAsType;
import org.example.camunda.process.solution.variable.TestVariables;
import org.example.camunda.process.solution.service.EsimeneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EsimeneWorker {

    private static final Logger LOG = LoggerFactory.getLogger(EsimeneWorker.class);

    private final EsimeneService myService;

    public EsimeneWorker(EsimeneService myService) {
        this.myService = myService;
    }

    @JobWorker
    public TestVariables esimeneWorker(@VariablesAsType TestVariables variables) {
        LOG.info("Invoking myService with variables: " + variables);

        boolean conditional = myService.getCondition(variables.getResult());

        return variables.setConditional(conditional);
    }
}
