package org.acme.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.teckhooi.service.ServiceB;

/**
 * @author Lim, Teck Hooi
 */

@Primary
@Component
public class CustomServiceB implements ServiceB {
    @Override
    public String executeB() {
        return "Custom Service B executed.";
    }
}
