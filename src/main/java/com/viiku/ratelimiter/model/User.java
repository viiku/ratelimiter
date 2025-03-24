package com.viiku.ratelimiter.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

@Table(name = "users")
@Entity
public class User {

    @NotBlank(message = "First Name can not be blank")
    private String firstName;

    private String middleName;

    @NotBlank(message = "Last Name can not be blank")
    private String lastName;

    @Id
    private String userId;

    @NotBlank(message = "Email can not be blank")
    private String email;

    @NotBlank(message = "Password can not be blank")
    private String password;

    private Date userCreationDateTime;

    // Hibernate requires default constructor
    public User() {}

    public User(String firstName, String middleName, String lastName, String userId, String email, String password, Date userCreationDateTime) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.userCreationDateTime = userCreationDateTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getUserCreationDateTime() {
        return userCreationDateTime;
    }

    public void setUserCreationDateTime(Date userCreationDateTime) {
        this.userCreationDateTime = userCreationDateTime;
    }
}
