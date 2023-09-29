package com.learning.data.rest.demo;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="Player")
@Getter
@Setter
@NoArgsConstructor
public class Player {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String nationality;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date birthDate;
    private int titles;

    public Player(String name, String nationality, Date birthDate, int titles) {
        super();
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.titles = titles;
    }
}
