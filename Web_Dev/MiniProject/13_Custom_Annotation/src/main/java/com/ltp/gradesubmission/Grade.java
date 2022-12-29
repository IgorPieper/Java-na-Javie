package com.ltp.gradesubmission;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

public class Grade {
    @NotBlank(message = "Name cannot be empty")
    @Size(min = 2, message = "Name must be longer than 2")
    private String name;
    @NotBlank(message = "Subject cannot be empty")
    @Size(min = 2, message = "Subject must be longer than 2")
    private String subject;
    @NotBlank(message = "Name cannot be empty")
    @Score(message = "Score must be a letter grade")
    private String grade;
    private String id;

    public Grade(String name, String subject, String grade) {
        this.name = name;
        this.subject = subject;
        this.grade = grade;
    }

    public Grade() {
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
