/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collectionapi;

import java.util.Iterator;

/**
 *
 * @author SMART
 */
public class User implements Comparable<User>{
    
    public int age;

    public User(int age){
        this.age = age;
    }
    
    @Override
    public int compareTo(User o) {
        int result = 0;
        if(o.age == this.age){
            result = 0;
        }else if(this.age > o.age){
            result = 1;
        }else if(this.age < o.age){
            result = -1;
        }
        return result;
    }

    
    
}
