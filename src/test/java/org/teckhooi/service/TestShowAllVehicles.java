package org.teckhooi.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.teckhooi.references.AllVehicles;

/**
 * @author Lim, Teck Hooi
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:customizedContext.xml")
public class TestShowAllVehicles {

    @Autowired
    private AllVehicles allVehicles;

    @Test
    public void showAllVehicles() {
        allVehicles.showAllBrandsOf();
    }
}
