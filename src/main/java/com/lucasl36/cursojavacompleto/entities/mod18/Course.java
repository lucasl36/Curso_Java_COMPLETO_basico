package com.lucasl36.cursojavacompleto.entities.mod18;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Lucas Lopes
 */
public class Course {

    private String name;
    private Teacher coordinator;
    private List<Student> students;

    public Course() {
        this.students = new ArrayList<>();
    }
    
    public Course(String name, Teacher coordinator, List<Student> students) {
        this.name = name;
        this.coordinator = coordinator;
        this.students = students;
    }

    @Override
    public String toString() {
        return name + " by " + coordinator.getName();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.coordinator);
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
        final Course other = (Course) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.coordinator, other.coordinator);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(Teacher coordinator) {
        this.coordinator = coordinator;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
}
