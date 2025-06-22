package com.example;

class Parent{
    void fun(){
        System.out.println("in Parent fun");
    }

    void run(){
        System.out.println("in parent run");
    }
}

class Child extends Parent{
    
    void fun(){
         System.out.println("in child fun");
    }
    void gun(){
         System.out.println("in child gun");
    }
}
public class MethodInherit {
      public static void main(String args[]){
      Parent p=new Child();
        Child ch=new Child();
        p.fun();
        ch.gun();
        p.run();
      }
}
