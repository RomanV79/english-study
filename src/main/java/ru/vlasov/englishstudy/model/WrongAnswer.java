package ru.vlasov.englishstudy.model;

import jakarta.persistence.*;

@Entity
@Table(name = "wrong_answers")
public class WrongAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "text")
    private String text;
    @ManyToOne
    @JoinColumn(name = "test_questions_id")
    private Test test;
}
