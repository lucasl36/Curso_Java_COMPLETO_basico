package com.lucasl36.cursojavacompleto.entities.boardinghouse;

import java.lang.reflect.Field;
import java.util.ArrayList;
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
        
    public List<Student> filterStudentsByText(String filteredAttribute, String text) {
        return this.students.stream()
                .filter(student -> checkIfAttributesTextContains(student, filteredAttribute, text))
                .collect(Collectors.toList());
    }
    
    private boolean checkIfAttributesTextContains(Student student, String attribute, String text) {
        try {
            Field field = Student.class.getDeclaredField(attribute);
            field.setAccessible(true);
            String currentText = (String) field.get(student);
            return !currentText.isBlank() && currentText.contains(text);
        } catch(NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("Warning! It was not possible to find out it students " + attribute + " contains " + text);
            return false;
        }
    }
        
}
