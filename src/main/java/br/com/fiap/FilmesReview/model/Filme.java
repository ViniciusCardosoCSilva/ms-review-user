package br.com.fiap.FilmesReview.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private Integer ano;

}
