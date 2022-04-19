package com.example.Customer.service;

import com.example.Customer.model.Busticket;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "BUS-SERVICE")
public interface BusticketRestConsumer {
    @GetMapping("/getLocation")
    public List<Busticket> getAllBusticket();
}
