/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.collectionapipart2;

import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SMART
 */
public class CollectionApiPart2 {

    public static void main(String[] args) {

        Student s = new Student(25, "Azay", "Jalil");
        Student s1 = new Student(25, "Azay", "Jalil");
        
        HashMap<Student, Integer> map = new HashMap<>();
        map.put(s, 1);
        map.put(s1, 2);
        
        System.out.println(map);
    }

    private static Socket method() {
        Socket socket = null;

        return socket;
    }
}
