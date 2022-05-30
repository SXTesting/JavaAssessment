package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        //TODO
        students.put(student.getId(), student);
    }

    public Student findStudent( String studentId )
    {
        //TODO
        if (students.containsKey(studentId)) {
            return students.get(studentId);
        }
        return null;
    }

    public boolean showSummary()
    {
        //TODO
        if (students.size() > 0) {
            for (Student s : students.values()) {
                System.out.println(s.toString());
                System.out.println("Enrolled Courses: ");
                s.printEnrollCourses();
            }
            return true;
        }
        return false;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //TODO
        students.get(studentId).enrollToCourse(course);
    }
}
