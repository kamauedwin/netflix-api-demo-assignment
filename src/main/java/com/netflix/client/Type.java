package com.netflix.client;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Table(name="type")
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "category_name")
    String typeName;

    @ManyToMany(mappedBy = "type")
    @JsonIgnore

    private List<Movies> movies;

    public Type() {
    }

    public Type(String typeName) {
        this.typeName = typeName;
    }

    public Type(String typeName, List<Movies> movies) {
        this.typeName = typeName;
        this.movies = movies;
    }

    public static void add(Type type) {
    }

    public static void addAll(Set<Type> types) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String gettypeName() {
        return typeName;
    }

    public void settypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<Movies> getMovies() {
        return movies;
    }

    public void setMovies(List<Movies> movies) {
        this.movies = movies;
    }
}

