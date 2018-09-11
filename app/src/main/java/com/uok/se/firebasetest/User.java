package com.uok.se.firebasetest;

/**
 * Created by USER on 18-07-2018.
 */

public class User {
    private String email,status;

    public User() {
    }

    public User(String email, String status) {
        this.email = email;
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus(){
        return status;
    }

}
