package project.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue
    @Column(name = "author_id")
    private int id;

    private String name;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    @JoinColumn(name = "email_fk_id")
    private Email email;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    @JoinColumn(name = "address_fk_id")
    private Address address;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "autor", orphanRemoval = true)
    private List<Phone> phones;
}
