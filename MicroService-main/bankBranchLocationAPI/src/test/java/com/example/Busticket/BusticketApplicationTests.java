package com.example.Busticket;

import com.example.Busticket.model.Busticket;
import com.example.Busticket.repository.BusticketRepository ;
import com.example.Busticket.service.BusService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BusticketApplicationTests {
    @Autowired
    private BusService busServices;
    @MockBean
    private Busticket busticketRepository;


    @Test

    public void getBusticketTest() {
        when(busticketRepository.findAll()).thenReturn((List<Busticket>) Stream.of(new Busticket(3, "pallab", 700090), new Busticket(4, "ram", 700080)).collect(Collectors.toList()));
        assertEquals(2, busServices.getAll().size());
    }

    @Test
    public void addBusticket() {
        Busticket busticket = new Busticket(999, "tim", 800090);
        when(busticketRepository.save(busticket)).thenReturn(busticket);
        assertEquals(busticket, busServices.createBusticket(busticket));
    }
}
