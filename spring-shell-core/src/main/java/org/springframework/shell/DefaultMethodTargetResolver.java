package org.springframework.shell;

import org.springframework.stereotype.Component;

@Component
public class DefaultMethodTargetResolver implements MethodTargetResolver {

    @Override
    public MethodTarget getMethodTarget(Input input) {
        return null;
    }
}
