package ru.vlasov.englishstudy.model;

import jakarta.persistence.*;

@Entity
@Table(name = "test_questions")
public class TestQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "sentence", nullable = false)
    private String sentence;

    @ManyToOne
    @JoinColumn(name = "topicVerb", nullable = false)
    private TopicVerb topicVerb;
}
