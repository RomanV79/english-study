package ru.vlasov.englishstudy.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "topic_verbs")
public class TopicVerb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "verb")
    private String verb;
    @OneToMany(mappedBy = "tests")
    private List<Test> tests;
    @OneToMany(mappedBy = "topicVerb")
    private List<TestQuestion> testQuestions;
}
