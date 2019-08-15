package com.netflix.client;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "movies")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "movie_name")
    private String movieName;

    @Column
    private String movieType;

    @ManyToMany
    @Column
    @JoinTable(name = "type_movies",
            joinColumns = @JoinColumn(name = "movieId"),
            inverseJoinColumns = @JoinColumn(name = "typeId"))
    private List<Type> types = new ArrayList<>();

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "clientId")
    private Users users;


    public Movies() {
    }

    public Movies(String movieName, String movieType) {
        this.movieName = movieName;
        this.movieType = movieType;

    }

    public Movies(String movieName, String movieType, Users users) {
        this.movieName = movieName;
        this.movieType = movieType;

        this.users = users;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public List<Type> getType() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public void addMovietype(Type type){ Type.add(type);
    }

    public void addMovieType(Set<Type> types) {
        Type.addAll(types);
    }
}
