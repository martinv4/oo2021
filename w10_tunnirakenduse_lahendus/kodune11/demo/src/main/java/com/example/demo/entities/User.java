package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "must enter a name")
    private String name;
    @NotBlank(message = "must enter an email")
    private String email;
    @NotBlank(message = "must enter time")
    private String kell;




public User() {}
 
public User(String name, String email, String kell) {
    this.name = name;
    this.email = email;
    this.kell = kell;
}

public void setId(long id) {
    this.id = id;
}

public long getId() {
    return id;
}

public void setName(String name) {
    this.name = name;
}

public void setEmail(String email) {
    this.email = email;
}

public void setKell(String kell) {
    this.kell = kell;
}

public String getName() {
    return name;
}

public String getEmail() {
    return email;
}

public String getKell() {
    return kell;
}

@Override
public String toString() {
    return "User{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
}
}