package com.example.Busticket.service;

import com.example.Busticket.model.Busticket;
import com.example.Busticket.repository.BusticketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {
    @Autowired
    BusticketRepository busticketRepository;

    public Busticket createBusticket(Busticket busticket){

        return busticketRepository.save(busticket);
    }

    public List<Busticket> createBusticket(List<Busticket> busticket){
       return busticketRepository.saveAll(busticket);
    }

    public List<Busticket> getAll(){
        return busticketRepository.findAll();
    }
}
