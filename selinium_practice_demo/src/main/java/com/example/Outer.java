package com.example;

public class Outer {
         
    class Inner{

        Inner(){
            System.out.println("In inner class");
        }
    }
        public static void main(String args[]){
            Inner obj=new Outer().new Inner();
            System.out.println(obj);
        }


}
