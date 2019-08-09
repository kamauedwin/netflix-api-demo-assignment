package com.api.netflix.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clients extends Users{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int clientID;
    private int userId;
    private Boolean isPaid;
    private String userRole;
    private int viewingID;


    public Clients(){ }

    public Clients(int clientID, int userId, Boolean isPaid, String userRole, int viewingID) {
        this.clientID = clientID;
        this.userId = userId;
        this.isPaid = isPaid;
        this.userRole = userRole;
        this.viewingID = viewingID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public int getViewingID() {
        return viewingID;
    }

    public void setViewingID(int viewingID) {
        this.viewingID = viewingID;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }
}
