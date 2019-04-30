package project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Email {

    @Id
    @GeneratedValue
    private int id;

    private String email;

}
