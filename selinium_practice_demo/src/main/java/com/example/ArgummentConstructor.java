package com.example;

class parent{
    parent(int a){
       System.out.println("In constructor" + a);
    }
}
class Child extends parent{
      
     Child(int c){
          super(20);
          System.out.println("In child" + c);
     }
}
public class ArgummentConstructor {
    public static void main(String args[]){
    // Child ch=new Child(30);
    parent ch=new Child(30); //we can create the obj of child calss by giving the reference of parent class
       // the same above program we can do with mothods as well
    }
}
