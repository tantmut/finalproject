package project.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Advertisement {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String text;
    private float price;
    private LocalDate date;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    @JoinColumn(name = "author_fk_id")
    private Author author;
}
