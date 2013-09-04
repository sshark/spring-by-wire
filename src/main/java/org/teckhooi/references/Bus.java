package org.teckhooi.references;

import org.springframework.stereotype.Component;

/**
 *
 * @author Lim, Teck Hooi
 */

@Component
public class Bus implements Vehicle {
    @Override
    public String getName() {
        return "Volvo";
    }
}
