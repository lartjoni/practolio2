package com.moldeproye.practolio2.experienciaYeducacionBkEn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; //posible problema archivo JSON no hay ID(de Visual-Studio-Code) 
    
    private String school;
    private String title;
    private String img;
    private String career;
    private int score;
    private String start;
    private String end;

    public Educacion() {
    }

    public Educacion(Long id, String school, String title, String img, String career, int score, String start, String end) {
        this.id = id;
        this.school = school;
        this.title = title;
        this.img = img;
        this.career = career;
        this.score = score;
        this.start = start;
        this.end = end;
    }
    
    
}
