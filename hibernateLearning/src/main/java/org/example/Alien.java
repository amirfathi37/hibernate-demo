package org.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name = "tbl_alien")
public class Alien {
    @javax.persistence.Id
    @GeneratedValue
    private Long Id;
    private String name;

    public Alien() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Alien(Long id, String name) {
        Id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
