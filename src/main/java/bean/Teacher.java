/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author SMART
 */
public class Teacher extends Person implements Comparable<Teacher>{

    public Teacher(int id, String name, String surname) {
        super(id, name, surname);
    }
    
//    @Override
//    public int hashCode(){
//        System.out.println("teacher hashcode="+super.getName());
//        return 1;
//    }
    
//    @Override
//    public boolean equals(Object x){
//        System.out.println("equals called"+x);
//        if(x instanceof Teacher){
//            Teacher t = (Teacher) x;
//            if(t.getId() == this.getId()){
//                return true;
//            }
//        }
//        return false;
//    }

    @Override
    public int compareTo(Teacher o) {
        if(this.getId() > o.getId()){
            return 1;
        }else if(this.getId() == o.getId()){
            return 0;
        }else{
            return -1;      
        }
    }
    
}
