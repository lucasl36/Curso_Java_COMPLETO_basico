package com.lucasl36.cursojavacompleto.entities.mod18;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Lucas Lopes
 */
public class Teacher {

    private String registration;
    private String name;
    private List<Course> courses;

    public Teacher() {
        this.courses = new ArrayList<>();
    }
    
    public Teacher(String registration, String name, List<Course> courses) {
        this.registration = registration;
        this.name = name;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return this.registration + " - " + this.name;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.registration);
        hash = 61 * hash + Objects.hashCode(this.name);
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
        final Teacher other = (Teacher) obj;
        if (!Objects.equals(this.registration, other.registration)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    
    
    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
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
