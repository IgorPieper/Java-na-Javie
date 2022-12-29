package com.example.demo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 2, message = "Name must be longer than 2")
    private String firstName;
    @NotBlank(message = "Name cannot be empty")
    @Size(min = 2, message = "Name must be longer than 2")
    private String lastName;
    @NotBlank(message = "Username cannot be empty")
    @Size(min = 7, message = "Username must be longer than 7")
    private String userName;
    @NotBlank(message = "Email cannot be empty")
    private String email;
    @Past(message = "Date cannot be in the future")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    public User(String firstName, String lastName, String userName, String email, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
