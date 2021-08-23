package dev.patika.gittigidiyorbootcampsecondhomework.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String courseName;
    private int courseCode;
    private int creditScore;

    public Course(String courseName, int courseCode, int creditScore) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditScore = creditScore;
    }

    public Course() {
    }

    @ManyToOne
    private dev.patika.gittigidiyorbootcampsecondhomework.model.Instructor instructor;

    @ManyToMany(mappedBy = "courses")
    private List<dev.patika.gittigidiyorbootcampsecondhomework.model.Student> students = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public dev.patika.gittigidiyorbootcampsecondhomework.model.Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(dev.patika.gittigidiyorbootcampsecondhomework.model.Instructor instructor) {
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseCode=" + courseCode +
                ", creditScore=" + creditScore +
                '}';
    }
}
