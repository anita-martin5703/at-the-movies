package edu.cnm.deepdive.atthemovies.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

//TODO Add annotations, fields, and methods to make this an Entity class.
@Entity
public class Actor {
    @Id
    private UUID id;

    private String name;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
