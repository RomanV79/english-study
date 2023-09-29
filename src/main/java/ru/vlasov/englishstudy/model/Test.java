package ru.vlasov.englishstudy.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tests")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "date", nullable = false)
    private Date date;
    @Column(name = "questins_total", nullable = false)
    private int questionsTotal;
    @Column(name = "right_answer")
    private int rightAnswer;

    @ManyToOne
    @JoinColumn(name = "topic_verb", nullable = false)
    private TopicVerb topicVerb;
    @ManyToOne
    @JoinColumn(name = "user", nullable = false)
    private User user;


}
