package org.teckhooi.references;

import org.springframework.stereotype.Component;

/**
 *
 * @author Lim, Teck Hooi
 */

@Component
public class Car implements Vehicle {
    @Override
    public String getName() {
        return "Mercedes";
    }
}
