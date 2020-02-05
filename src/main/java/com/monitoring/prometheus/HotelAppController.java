package com.monitoring.prometheus;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelAppController {

    // collects the timely information about this endpoint
    @Timed(
            value = "monitoring.hotels.request",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "1.0"}
    )
    @GetMapping("/hotels")
    public String getHotel() {
        return "Hotel Taj";
    }

    @Timed(
            value = "monitoring.restaurants.request",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "1.0"}
    )
    @GetMapping("/restaurants")
    public String getRestaurant() {
        return "Empire Restaurant";
    }
}
