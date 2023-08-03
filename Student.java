/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package association;

import java.util.ArrayList;

/**
 *
 * @author zulal
 */
public class Student {
    
    
    private String name;
    private int id;
    private String dept;
    private static int count;
    private ArrayList <Course> courses;
    
    public Student(String name, String dept){
        this.name= name;
                this.dept= dept;
                id= count++;
                
                courses= new ArrayList<>();
    }
    
    public void addNewCourse(Course c){
        courses.add(c);
        c.addNewStudent(this); // add the student itself into course's list
    }
    
    public void removeCourse(Course c){
        courses.remove(c);
        c.removeStudent(this); // remove the student itself from course's list
    }
}
