package com.service.springserviceproject.aaaEntities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Doktor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;
    private String speciality;
    private double maas;

    @JsonIgnore
    @OneToMany(mappedBy = "doktor")
    private List<Randevu> randevular;

    // Constructor
    public Doktor() {}


}