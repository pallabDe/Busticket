package com.example.Busticket.repository;

import com.example.Busticket.model.Busticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BusticketRepository extends JpaRepository<Busticket,Integer> {

}
