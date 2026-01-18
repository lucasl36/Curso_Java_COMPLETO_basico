package com.lucasl36.cursojavacompleto.services;

import com.lucasl36.cursojavacompleto.entities.mod18.*;
import java.util.*;

/**
 *
 * @author Lucas Lopes
 */
public class CourseMockDataCreator {

    public static List<Course> getMockCourses(Integer iterations, List<Teacher> avaiableTeachers, List<Student> avaiableStudents) {
        Random random = new Random();
        Set<Course> mockData = new HashSet<>();
        for(int i = 0; i < iterations; i++) {
            Course mock = new Course();
            // Name
            mock.setName(getRandomCoursesName());
            // Teacher
            mock.setCoordinator(avaiableTeachers.get(random.nextInt(avaiableTeachers.size())));
            // Students
            Set<Student> mockStudents = new HashSet<>();
            for(int j = 0; j < Constants.MAX_STUDENTS_PER_COURSE; j++) {
                mockStudents.add(avaiableStudents.get(random.nextInt(avaiableStudents.size())));
            }
            mock.setStudents(new ArrayList<>(mockStudents));
            
            mockData.add(mock);
        }
        return new ArrayList<>(mockData);
    }
    
    public static List<Teacher> getMockTeachersData(Integer iterations, List<Course> avaibleCourses) {
        Random random = new Random();
        Set<Teacher> mockData = new HashSet<>();
        for(int i = 0; i < iterations; i++) {
            Teacher mock = new Teacher();
            // Registration
            mock.setRegistration(getRandomRegistration(Constants.DEFAULT_TEACHERS_REGISTRATION_SIZE));
            // Techaer's Name
            mock.setName(getRandomTeachersName());
            // Courses
            Set<Course> mockCourses = new HashSet<>();
            for(int j = 0; j < Constants.MAX_COURSES_PER_TEACHER; j++) {
                mockCourses.add(avaibleCourses.get(random.nextInt(avaibleCourses.size())));
            }
            mock.setCourses(new ArrayList<>(mockCourses));
             
            mockData.add(mock);
        }
        return new ArrayList<>(mockData);
    }
    
    public static List<Student> getMockStudentsData(Integer iterations, List<Course> avaibleCourses) {
        Random random = new Random();
        Set<Student> mockData = new HashSet<>();
        for(int i = 0; i < iterations; i++) {
            Student mock = new Student();
            // Enrollment
            mock.setEnrollment(getRandomEnrollment());
            // Name
            mock.setName(getRandomName());
            // Courses
            Set<Course> mockCourses = new HashSet<>();
            for(int j = 0; j < Constants.MAX_COURSES_PER_STUDENT; j++) {
                mockCourses.add(avaibleCourses.get(random.nextInt(avaibleCourses.size())));
            }
            mock.setCourses(new ArrayList<>(mockCourses));
            
            mockData.add(mock);
        }
        return new ArrayList<>(mockData);
    }
    
    private static String getRandomCoursesName() {
        List<String> coursesSample = getCoursesSample();
        Random random = new Random();
        return coursesSample.get(random.nextInt(coursesSample.size()));
    }
    
    private static String getRandomTeachersName() {
        List<String> academicTitlesSample = getAcademicTitleSample();
        StringBuilder randomTeachersName = new StringBuilder();
        Random random = new Random();
        randomTeachersName.append(academicTitlesSample.get(random.nextInt(academicTitlesSample.size())));
        randomTeachersName.append(" ");
        randomTeachersName.append(getRandomName());
        return randomTeachersName.toString();
    }
    
    private static String getRandomName() {
        List<String> namesSample = getNameSamples();
        List<String> surnameSample = getSurnameSample();
        StringBuilder randomName = new StringBuilder();
        Random random = new Random();
        randomName.append(namesSample.get(random.nextInt(namesSample.size())));
        randomName.append(" ");
        randomName.append(surnameSample.get(random.nextInt(surnameSample.size())));
        return randomName.toString();
    }
    
    private static Integer getRandomEnrollment() {
        Random random = new Random();
        return random.nextInt(100000 - 100 + 1) + 100;
    }
    
    private static String getRandomRegistration(Integer size) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            int digit = random.nextInt(10);
            sb.append(digit);
        }
        return sb.toString();
    }
    
    private static List<String> getNameSamples() {
        return Arrays.asList(
            "Smith", "Jones", "Williams", "Brown", "Taylor", "Davies", "Evans", "Wilson", "Thomas", "Johnson",
            "Roberts", "Robinson", "Thompson", "Wright", "Walker", "White", "Edwards", "Hughes", "Green", "Hall",
            "Lewis", "Harris", "Clarke", "Patel", "Jackson", "Wood", "Turner", "Martin", "Cooper", "Hill",
            "Ward", "Morris", "Moore", "Clark", "Lee", "King", "Baker", "Harrison", "Morgan", "Allen",
            "James", "Scott", "Phillips", "Watson", "Davis", "Parker", "Price", "Bennett", "Young", "Griffiths",
            "Mitchell", "Kelly", "Cook", "Carter", "Richardson", "Bailey", "Collins", "Bell", "Shaw", "Murphy",
            "Miller", "Cox", "Richards", "Khan", "Marshall", "Anderson", "Simpson", "Ellis", "Adams", "Singh",
            "Begum", "Wilkinson", "Foster", "Chapman", "Powell", "Webb", "Rogers", "Gray", "Mason", "Ali",
            "Hunt", "Hussain", "Campbell", "Matthews", "Owen", "Palmer", "Holmes", "Mills", "Barnes", "Knight",
            "Lloyd", "Butler", "Russell", "Barker", "Harvey", "Pearson", "Graham", "Stevens", "Walsh", "Fisher",
            "Fox", "Dean", "Gilbert", "Gibson", "Howard", "Dixon", "Wells", "Coleman", "West", "Reynolds"
        );
    }
    
    private static List<String> getSurnameSample() {
        return Arrays.asList(
            "Smith", "Jones", "Williams", "Brown", "Taylor", "Davies", "Evans", "Wilson", "Thomas", "Johnson",
            "Roberts", "Robinson", "Thompson", "Wright", "Walker", "White", "Edwards", "Hughes", "Green", "Hall",
            "Lewis", "Harris", "Clarke", "Patel", "Jackson", "Wood", "Turner", "Martin", "Cooper", "Hill",
            "Ward", "Morris", "Moore", "Clark", "Lee", "King", "Baker", "Harrison", "Morgan", "Allen",
            "James", "Scott", "Phillips", "Watson", "Davis", "Parker", "Price", "Bennett", "Young", "Griffiths",
            "Mitchell", "Kelly", "Cook", "Carter", "Richardson", "Bailey", "Collins", "Bell", "Shaw", "Murphy",
            "Miller", "Cox", "Richards", "Khan", "Marshall", "Anderson", "Simpson", "Ellis", "Adams", "Singh",
            "Begum", "Wilkinson", "Foster", "Chapman", "Powell", "Webb", "Rogers", "Gray", "Mason", "Ali",
            "Hunt", "Hussain", "Campbell", "Matthews", "Owen", "Palmer", "Holmes", "Mills", "Barnes", "Knight",
            "Lloyd", "Butler", "Russell", "Barker", "Harvey", "Pearson", "Graham", "Stevens", "Walsh", "Fisher",
            "Fox", "Dean", "Gilbert", "Gibson", "Howard", "Dixon", "Wells", "Coleman", "West", "Reynolds"
        );
    }
    
    private static List<String> getAcademicTitleSample() {
        return Arrays.asList(
            "BA","BSc","BEng","LLB","MA","MSc","MEng","LLM","MBA","MPhil","PhD","DPhil","Dr","Prf"
        );
    }
    
    private static List<String> getCoursesSample() {
        return Arrays.asList(
            "Business Administration",
            "Accounting and Finance",
            "Childcare and Early Years Education",
            "Health and Social Care",
            "Nursing Assistant Studies",
            "Graphic Design",
            "Photography",
            "Web Development",
            "Software Development",
            "Cybersecurity Fundamentals",
            "IT Support and Networking",
            "Electrical Installation",
            "Plumbing",
            "Carpentry and Joinery",
            "Bricklaying",
            "Motor Vehicle Maintenance and Repair",
            "Automotive Engineering",
            "Hairdressing",
            "Beauty Therapy",
            "Barbering",
            "Catering and Professional Cookery",
            "Hospitality Management",
            "Travel and Tourism",
            "Event Management",
            "Fashion Design",
            "Textiles and Garment Construction",
            "Performing Arts (Dance, Drama, Music)",
            "Media Production",
            "Journalism",
            "Digital Marketing",
            "Customer Service",
            "Retail Management",
            "Warehouse and Logistics Operations",
            "Engineering (Mechanical)",
            "Engineering (Electrical/Electronic)",
            "Engineering (Civil)",
            "Aerospace Engineering",
            "Construction Management",
            "Painting and Decorating",
            "Tiling and Flooring",
            "Gardening and Landscaping",
            "Animal Care",
            "Veterinary Nursing",
            "Counselling Skills",
            "Mental Health Awareness",
            "Fitness Instructing and Personal Training",
            "Sports Coaching",
            "Public Services (Uniformed)",
            "Forensic Science (Introductory)",
            "Environmental Sustainability"
        );
    }
    
}
