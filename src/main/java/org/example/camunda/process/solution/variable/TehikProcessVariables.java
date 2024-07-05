package org.example.camunda.process.solution.variable;

public class TehikProcessVariables {
    private int clientNumber;
    private Integer minNumber;
    private Integer maxNumber;

    public int getClientNumber() {
        return clientNumber;
    }

    public TehikProcessVariables setUserNumber(int clientNumber) {
        this.clientNumber = clientNumber;
        return this;
    }

    public Integer getMinNumber() {
        return minNumber;
    }

    public TehikProcessVariables setMinNumber(Integer minNumber) {
        this.minNumber = minNumber;
        return this;
    }

    public Integer getMaxNumber() {
        return maxNumber;
    }

    public TehikProcessVariables setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
        return this;
    }
}
