package com.FullStack.Bookmarks.model;

import javax.persistence.*;

@Entity
public class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    @Column(length = 2048)
    private String description;
    private String type;
    private String tecnology;

    public Element() {}

    public Element(String description, String type, String tecnology) {
        this.description = description;
        this.type = type;
        this.tecnology = tecnology;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTecnology() {
        return tecnology;
    }

    public void setTecnology(String tecnology) {
        this.tecnology = tecnology;
    }

    @Override
    public String toString() {
        return "Element{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", tecnology='" + tecnology + '\'' +
                '}';
    }
}
