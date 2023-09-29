package ru.vlasov.englishstudy.model;

import jakarta.persistence.*;

@Entity
@Table(name = "topic_verbs")
public class TopicVerb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "verb", nullable = false)
    private String verb;
}