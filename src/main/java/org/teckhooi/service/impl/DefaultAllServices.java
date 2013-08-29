package org.teckhooi.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.teckhooi.service.AllServices;
import org.teckhooi.service.ServiceA;
import org.teckhooi.service.ServiceB;

/**
 * @author Lim, Teck Hooi
 */

@Component
public class DefaultAllServices implements AllServices {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultAllServices.class);

    @Autowired
    private ServiceA serviceA;

    @Autowired
    private ServiceB serviceB;

    @Override
    public String executeAllServices() {
        LOGGER.debug("** Execute all services");
        return serviceA.executeA() + serviceB.executeB();
    }
}
