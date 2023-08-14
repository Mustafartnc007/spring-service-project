package com.service.springserviceproject.aaaEntities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Hasta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;
    private Date birthdate;

    @JsonIgnore
    @OneToMany(mappedBy = "hasta", cascade = CascadeType.ALL)
    private List<Randevu> randevular;

    // Constructor
    public Hasta() {}


}
