package com.company.app.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "exercise")
@Data
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(chapter_id = "chapter_id")
    private int chapter_id;

    @Column(exercise = "exercise")
    private String exercise;

    @Column(answer = "answer")
    private String answer;
}
