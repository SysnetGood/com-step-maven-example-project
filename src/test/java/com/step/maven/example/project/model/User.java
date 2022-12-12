package com.step.maven.example.project.model;


import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String Login;
    private String Password;

    @Column (name = "address")
    private String user_address;

    public User () { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAddress() {
        return user_address;
    }

    public void setAddress(String address) {
        this.user_address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Login='" + Login + '\'' +
                ", Password='" + Password + '\'' +
                ", address='" + user_address + '\'' +
                '}';
    }
}
