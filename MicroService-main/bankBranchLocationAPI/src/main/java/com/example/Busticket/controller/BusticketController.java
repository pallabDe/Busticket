package com.example.Busticket.controller;

import com.example.Busticket.model.Busticket;
import com.example.Busticket.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Bus")
public class BusticketController {
    @Autowired
    private BusService busService;


    @PostMapping("/addBusticket")
    public Busticket addBusticket(@RequestBody Busticket busticket)
            {return busService.createBusticket(busticket);}
    @PostMapping("/Busticket")
    public List<Busticket> addBusticket(@RequestBody List<Busticket> busticket){
        return busService.createBusticket(busticket);
    }
    @GetMapping("/getLocation")
    public List<Busticket> getAllBusticket(){
        return busService.getAll();
    }
}
