package org.teckhooi.service.impl;

import org.springframework.stereotype.Component;
import org.teckhooi.service.ServiceA;

/**
 * @author Lim, Teck Hooi
 */

@Component
public class DefaultServiceA implements ServiceA {
    @Override
    public String executeA() {
        return "Service A executed.";
    }
}
