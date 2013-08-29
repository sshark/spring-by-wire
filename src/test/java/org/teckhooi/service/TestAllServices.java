package org.teckhooi.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Lim, Teck Hooi
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAllServices {
    @Autowired
    private AllServices allServices;

    @Test
    public void testServices() {
        Assert.assertEquals("Service A executed.Custom Service B executed.", allServices.executeAllServices());
    }
}
