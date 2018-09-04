package org.springframework.shell;

public class InvocationResult {

    private Object result;
    private boolean invoked;

    public InvocationResult(Object result, boolean invoked) {
        this.result = result;
        this.invoked = invoked;
    }

    public Object getResult() {
        return result;
    }

    public boolean isInvoked() {
        return invoked;
    }
}
