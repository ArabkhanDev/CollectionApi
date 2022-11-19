package com.mycompany.collectionapi;

import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author SMART
 */
public class MyArrayList implements Iterable<String>{

    private String[] elementData = new String[10];
    int size = 0;

    public void add(String element) {
        encureCapacity();

        elementData[size++] = element;
    }

    public void encureCapacity() {
        if (elementData.length == size) {
            String[] arr2 = new String[elementData.length / 2 + elementData.length];
            for (int i = 0; i < elementData.length; i++) {
                arr2[i] = elementData[i];
            }

            elementData = arr2;
        }
    }

    public String get(int i) {
        return elementData[i];
    }

    public int size() {
        return size;
    }
    
    
    private Iterator iter = new Iterator() {
        
            int i = 0;
                     
            @Override
            public boolean hasNext() {
                return elementData.length < ++i;
            }

            @Override
            public Object next() {
                return elementData[++i];
            }    
    };
    
           
    @Override
    public Iterator<String> iterator() {     
        return iter;           
    }
}
