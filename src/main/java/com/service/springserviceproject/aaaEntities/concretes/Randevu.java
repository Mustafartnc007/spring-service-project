package com.service.springserviceproject.aaaEntities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Randevu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String time;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "hasta_id")
    private Hasta hasta;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "doktor_id")
    private Doktor doktor;

    // Constructor
    public Randevu() {}


}

