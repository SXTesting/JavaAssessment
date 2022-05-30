package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;

    private ArrayList<Course> enrolledCourses;

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
        enrolledCourses = new ArrayList<>();
    }

    public void enrollToCourse( Course course )
    {
        //TODO
        enrolledCourses.add(course);
    }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
        ArrayList<Course> passCourses = new ArrayList<>();
        for (Course passCourse: enrolledCourses) {
            if (passCourse.getGrade() >= 3) {
                passCourses.add(passCourse);
            }
        }
        return passCourses;
    }

    public Course findCourseById( String courseId )
    {
        //TODO
       for (Course course: enrolledCourses) {
           if (course.getCode().equals(courseId)) {
               return course;
           }
       }
       return null;
    }

    public void printEnrollCourses() {
        for (Course c: getEnrolledCourses()) {
            System.out.println(c.toString() + " Grade: " + c.getGrade());
        }
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO
        return enrolledCourses;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}
