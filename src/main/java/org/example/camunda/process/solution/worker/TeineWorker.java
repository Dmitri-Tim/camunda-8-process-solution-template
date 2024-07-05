package org.example.camunda.process.solution.worker;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.VariablesAsType;
import org.example.camunda.process.solution.variable.TestVariables;
import org.example.camunda.process.solution.service.TeineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TeineWorker {

  private static final Logger LOG = LoggerFactory.getLogger(TeineWorker.class);

  private final TeineService myService;

  public TeineWorker(TeineService myService) {
    this.myService = myService;
  }

    @JobWorker
    public TestVariables teineWorker(@VariablesAsType TestVariables variables) {
        LOG.info("Invoking myService with variables: " + variables);

        return variables.setResult(myService.myOperation(variables.getResult()));
    }
}
