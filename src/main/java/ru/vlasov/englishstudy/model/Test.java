package ru.vlasov.englishstudy.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tests")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "date")
    private Date date;
    @Column(name = "question_total")
    private int questionTotal;
    @Column(name = "right_answers")
    private int rightAnswers;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "topic_verbs_id")
    private TopicVerb topicVerb;
}
