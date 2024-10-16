package br.com.fiap.FilmesReview.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

}
