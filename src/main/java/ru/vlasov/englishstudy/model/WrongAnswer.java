package ru.vlasov.englishstudy.model;

import jakarta.persistence.*;

@Entity
@Table(name = "wrong_answers")
public class WrongAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "answer", nullable = false)
    private String answer;
    @ManyToOne
    @JoinColumn(name = "test_question", nullable = false)
    private TestQuestion testQuestion;
}
