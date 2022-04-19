package com.example.Customer.controller;

import com.example.Customer.model.Busticket;
import com.example.Customer.service.BusticketRestConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
    @Autowired
    private BusticketRestConsumer busticketRestConsumer;
    @GetMapping("/allBusticket")
    public List<Busticket> getAll(){
        return busticketRestConsumer.getAllBusticket();
    }
}
