package org.example.camunda.process.solution.model;

public class ConditionalBody {
    private boolean condition;

    public boolean isCondition() {
        return condition;
    }

    public ConditionalBody setCondition(boolean condition) {
        this.condition = condition;
        return this;
    }
}
