package com.netflix.client;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "identification_number")
    int  identificationNumber;

    @Column(name = "client_name")
    String clientName;

    @OneToMany(mappedBy = "client")

    private List<Movies> movies = new ArrayList<>();

    public Users() {
    }

    public Users(int  identificationNumber, String clientName) {
        this.identificationNumber = identificationNumber;
        this.clientName = clientName;
    }


    public int getId() {
        return id;
    }



    public int  getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int  identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public List<Movies> getMovie() {
        return movies;
    }

    public void setMovie(List<Movies> movie) {
        this.movies = movie;
    }

    public void addMovie(Movies movie) {
        movies.add(movie);
    }


}
