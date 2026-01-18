package com.lucasl36.cursojavacompleto.entities.mod18;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Lucas Lopes
 */
public class Student {

    private Integer enrollment;
    private String name;
    private List<Course> courses;

    public Student() {
        this.courses = new ArrayList<>();
    }

    public Student(Integer enrollment, String name, List<Course> courses) {
        this.enrollment = enrollment;
        this.name = name;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return String.valueOf(enrollment) + " - " + this.name;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.enrollment);
        hash = 71 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.enrollment, other.enrollment);
    }
    
    public Integer getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Integer enrollment) {
        this.enrollment = enrollment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    
    
    
}
