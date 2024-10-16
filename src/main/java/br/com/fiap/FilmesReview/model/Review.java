package br.com.fiap.FilmesReview.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texto;

    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;

}
