/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.collectionapi;

import bean.Student;
import bean.Teacher;
import java.util.HashMap;

/**
 *
 * @author SMART
 */
public class Main {

    public static void main(String[] args) {

        HashMap<Teacher, Student> students = new HashMap<>();
        Teacher teacher = new Teacher(1, "Sarkhan", "Rasullu");
        Teacher teacher2 = new Teacher(2, "Sarkhan2", "Rasullu2");

        students.put(teacher, new Student(1, "Eldar", "Novruzov"));
        students.put(teacher2, new Student(2, "Azay", "Jalil"));
        
        System.out.println("get is called");
        students.get(teacher2);

    }
}
