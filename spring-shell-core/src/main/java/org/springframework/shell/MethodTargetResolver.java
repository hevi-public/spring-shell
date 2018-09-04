package org.springframework.shell;

public interface MethodTargetResolver {

    default boolean isAvailable() {
        return false;
    }

    MethodTarget getMethodTarget(Input input);
}
