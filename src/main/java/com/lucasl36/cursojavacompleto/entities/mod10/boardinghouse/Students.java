package com.lucasl36.cursojavacompleto.entities.mod10.boardinghouse;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Lucas Lopes
 */
public class Students {

    private List<Student> students;
    
    public Students() {
        this.students = new ArrayList<>();
    }
     
    public List<Student> getStudentsImmutableList() {
        List<Student> unsortedStudentsList = new ArrayList<>(this.students);
        Collections.sort(unsortedStudentsList, Comparator.comparing(Student::hasARoom).reversed());
        List<Student> studentsImmutableList = Collections.unmodifiableList(unsortedStudentsList);
        return studentsImmutableList;
    } 
    
    public void registerStudent(Student student) {
        this.students.add(student);
    }
    
    public List<Student> listStudentsByOccupancy(boolean hasRoom) {
        List<Student> filteredStudents = this.students.stream()
                .filter(student -> student.hasARoom() == hasRoom)
                .collect(Collectors.toList());
        return filteredStudents;
    }
            
}
