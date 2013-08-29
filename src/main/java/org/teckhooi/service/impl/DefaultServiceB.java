package org.teckhooi.service.impl;

import org.springframework.stereotype.Component;
import org.teckhooi.service.ServiceB;

/**
 * @author Lim, Teck Hooi
 */

@Component
public class DefaultServiceB implements ServiceB {
    @Override
    public String executeB() {
        return "Service B executed.";
    }
}
