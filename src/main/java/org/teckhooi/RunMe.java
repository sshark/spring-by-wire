package org.teckhooi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.teckhooi.service.AllServices;
import org.teckhooi.service.ServiceA;
import org.teckhooi.service.ServiceB;

/**
 *
 * @author Lim, Teck Hooi
 *
 *
 */

@Component
public class RunMe implements AllServices {
    @Autowired
    private ServiceA serviceA;

    @Autowired
    private ServiceB serviceB;

    @Override
    public String executeAllServices() {
        StringBuilder buffer = new StringBuilder("Execute ")
            .append(serviceA.executeA())
            .append(" and ")
            .append(serviceB.executeB());
        System.out.println(buffer.toString());
        return buffer.toString();
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AllServices allServices = (AllServices) context.getBean("runMe");
        allServices.executeAllServices();
    }
}
