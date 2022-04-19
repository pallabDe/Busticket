package com.example.Busticket.model;


import javax.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Busticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull(message="The Busticket Name Should Not be Empty")
    private String name;
    @NotNull(message="The Busticket price Should Not be Empty")
    private int price;

    //public Object findAll() {
   // }

  //  public Object save(Busticket busticket) {
   // }
}
