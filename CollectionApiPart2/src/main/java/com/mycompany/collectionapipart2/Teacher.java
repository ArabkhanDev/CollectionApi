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
public class Teacher{

    private int age;
    private String name;
    private String surname;

    public Teacher(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }
    
    
    
   
    @Override
    public int hashCode() {
        int hash = 4;
        hash = 67 * hash + this.age;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.surname);
        return hash;
    }

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
        final Teacher other = (Teacher) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.surname, other.surname);
    }
}
