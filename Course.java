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
public class Course {
    private String code, cName, givenBy;
    private int credit;
    private ArrayList<Student> students;
    
    public Course(String code, String cName, int credit){
        this.code = code;
        this.cName= cName;
        this.credit= credit;
        
        students= new ArrayList<>();
    }
    
    public void addNewStudent(Student s){
        students.add(s);
    }
    
    public void removeStudent(Student s){
        students.remove(s);
    }
}
