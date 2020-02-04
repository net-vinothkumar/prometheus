package com.monitoring.prometheus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelAppController {

    @GetMapping("/hotels")
    public String getHotel() {
        return "Hotel Taj";
    }
}
