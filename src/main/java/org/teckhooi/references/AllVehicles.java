package org.teckhooi.references;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Lim, Teck Hooi
 */

/*
    Do not use @Component, otherwise vehicles will not be set properly. I suspect there are 2 instances of AllVehicles
    created by @Component and the <bean> tag.
 */
public class AllVehicles {
    private List<Vehicle> vehicles;

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void showAllBrandsOf() {
        for (Vehicle v : vehicles) {
            System.out.println(v.getName());
        }
    }
}
