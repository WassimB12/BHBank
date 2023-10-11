package com.example.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;


import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CoursMarche {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
private String dev;
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
private Date dte;
private int mrch;
    private float bctA;
    private double bctV;
    private  double bhA;
private    double bhV;
private    int unt;


 private String etatEnv="En instance";


}
