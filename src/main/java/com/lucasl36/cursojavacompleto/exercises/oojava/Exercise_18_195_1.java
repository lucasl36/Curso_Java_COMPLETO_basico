package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.entities.mod18.*;
import com.lucasl36.cursojavacompleto.services.CourseMockDataCreator;
import com.lucasl36.cursojavacompleto.helpers.CollectionsHelper;

import java.util.*;
import java.util.stream.*;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_18_195_1 extends OOJavaExercise {

    private List<Student> enrolledStudents;
    private List<Teacher> registeredTeachers;
    private List<Course> avaiableCourses;
        
    public Exercise_18_195_1() {
        super("Exercise mod. 18 lesson 195 num. 1 - Professional School of Random Sets");
        this.enrolledStudents = CourseMockDataCreator.getMockStudentsData(Constants.MAX_MOCK_ITERATIONS_FOR_STUDENTS);
        this.registeredTeachers = CourseMockDataCreator.getMockTeachersData(Constants.MAX_MOCK_ITERATIONS_FOR_TEACHERS);
        this.avaiableCourses = CourseMockDataCreator.getMockCourses(Constants.MAX_MOCK_ITERATIONS_FOR_COURSES, registeredTeachers, enrolledStudents);
    }    

    @Override
    public void execute() {
        System.out.println("Professional School of Random Sets");
        System.out.println("==================================");
        Integer opt = null;
        while(Objects.isNull(opt) || opt != 0) {
            this.showMainOptions();
            opt = Main.sc.nextInt();
            switch(opt) {
                case 1: {
                    this.ListEnrolledStudents();
                    break;
                }
                case 2: {
                    this.ListOccupiedStudents();
                    break;
                }
                case 3: {
                    this.ListVacantStudents();
                    break;
                }
                case 4: {
                    this.ListRegisteredTeachers();
                    break;
                }
                case 5: {
                    this.ListCoordinators();
                    break;
                }
                case 6: {
                    this.ListVacantTeachers();
                    break;
                }
                case 7: {
                    this.ListCourses();
                    break;
                }
                case 8: {
                    this.ListFullCourses();
                    break;
                }
                case 9: {
                    this.ListVacantCourses();
                    break;
                }
                case 0: {
                    System.out.println("Exiting...");
                    break;
                }
                default: {
                    System.out.println("No such option...");
                    break;
                }
            }
        }
    }
    
    private void showMainOptions() {
        System.out.println("Choose an option:");
        System.out.println("1. List enrolled students");
        System.out.println("2. List occupied students");
        System.out.println("3. List vacant students");
        System.out.println("4. List registered teachers");
        System.out.println("5. List coordinators");
        System.out.println("6. List vacant teachers");
        System.out.println("7. List courses");
        System.out.println("8. List full courses");
        System.out.println("9. List vacant courses");
        System.out.println("0. Exit");
    }
    
    private void ListEnrolledStudents() {
        System.out.println("Listing all students...");
        CollectionsHelper.outputObjectsList(enrolledStudents);
    }
    
    private void ListOccupiedStudents() {
        System.out.println("Listing occupied students...");
        List<Student> occupiedStudents = enrolledStudents
                .stream()
                .filter(s -> s.getCourses().size() == Constants.MAX_COURSES_PER_STUDENT)
                .collect(Collectors.toList());
        CollectionsHelper.outputObjectsList(occupiedStudents);
    }
    
    private void ListVacantStudents() {
        System.out.println("Listing vacant students...");
        List<Student> vacantStudents = enrolledStudents
                .stream()
                .filter(s -> s.getCourses().size() < Constants.MAX_COURSES_PER_STUDENT)
                .sorted(Comparator.comparing((Student s) -> s.getCourses().size()))
                .collect(Collectors.toList());
        CollectionsHelper.outputObjectsList(vacantStudents);
    }
    
    private void ListRegisteredTeachers() {
        System.out.println("Listing all teacher...");
        CollectionsHelper.outputObjectsList(registeredTeachers);
    } 
    
    private void ListCoordinators() {
        System.out.println("Listing all coordinators...");
        List<Teacher> coordinators = registeredTeachers
                .stream()
                .filter(t -> t.getCourses().size() > 0)
                .sorted(Comparator.comparing((Teacher t) -> t.getCourses().size()).reversed())
                .collect(Collectors.toList());
        CollectionsHelper.outputObjectsList(coordinators);
    }
    
    private void ListVacantTeachers() {
        System.out.println("Listing vacant teachers...");
        List<Teacher> vacantTeachers = registeredTeachers
                .stream()
                .filter(t -> t.getCourses().size() < Constants.MAX_COURSES_PER_TEACHER)
                .sorted(Comparator.comparing((Teacher t) -> t.getCourses().size()))
                .collect(Collectors.toList());
        CollectionsHelper.outputObjectsList(vacantTeachers);
    }
    
    private void ListCourses() {
        System.out.println("Listing all courses...");
        CollectionsHelper.outputObjectsList(avaiableCourses);
    }
    
    private void ListFullCourses() {
        System.out.println("Listing full courses...");
        List<Course> fullCourses = avaiableCourses
                .stream()
                .filter(c -> c.getStudents().size() == Constants.MAX_STUDENTS_PER_COURSE)
                .collect(Collectors.toList());
        CollectionsHelper.outputObjectsList(fullCourses);
    }
    
    private void ListVacantCourses() {
        System.out.println("Listing vacant courses...");
        List<Course> vacantCourses = avaiableCourses
                .stream()
                .filter(c -> c.getStudents().size() < Constants.MAX_STUDENTS_PER_COURSE)
                .sorted(Comparator.comparing((Course c) -> c.getStudents().size()))
                .collect(Collectors.toList());
        CollectionsHelper.outputObjectsList(vacantCourses);
    }
    
}
