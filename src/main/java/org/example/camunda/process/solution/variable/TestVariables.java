package org.example.camunda.process.solution.variable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(Include.NON_NULL)
public class TestVariables {
    private boolean conditional;
    private String result;

    public boolean isConditional() {
        return conditional;
    }

    public TestVariables setConditional(boolean conditional) {
        this.conditional = conditional;
        return this;
    }

    public String getResult() {
        return result;
    }

    public TestVariables setResult(String result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(
                this,
                new MultilineRecursiveToStringStyle() {
                    public ToStringStyle withShortPrefixes() {
                        this.setUseShortClassName(true);
                        this.setUseIdentityHashCode(false);
                        return this;
                    }
                }.withShortPrefixes());
    }
}
