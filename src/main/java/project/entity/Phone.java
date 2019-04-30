package project.entity;

import javax.persistence.*;

@Entity
public class Phone {

    @Id
    @GeneratedValue
    private int id;

    private String number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_fk_id")
    private Author author;
}
