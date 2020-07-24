/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author kostis
 */
public class StudentsPlayMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1=new Student("Jack",20,9);
        Student s2=new Student("Kostis",25,8);
        Student s3=new Student("Kevin",30,7);
        Student s4=new Student("Kevin",30,7);
        
        HashSet<Student> set = new HashSet<Student>();
        
        set.add(s1);
        set.add(s2);
        set.add(s3);
        
        for(Student h: set){
        System.out.println(h);}
        
        TreeSet<Student> ts = new TreeSet<Student>();
        
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        
       
        
    }
    
}
