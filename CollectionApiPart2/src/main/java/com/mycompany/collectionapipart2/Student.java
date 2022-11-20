/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collectionapipart2;

import java.util.Objects;

/**
 *
 * @author SMART
 */
public class Student{

    private int age;
    private String name;
    private String surname;

    public Student(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }
    
    
    
//    @Override
//    public int hashCode() {
//        int a = 3;
//        a = 67 * a + this.age;
//        a = 67 * a + Objects.hashCode(this.name);
//        a = 67 * a + Objects.hashCode(this.surname);
//        return a;
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.surname, other.surname);
    }
}
