package com.example;

public class DemoInherit {
            int x=10;
            int y=20;
        DemoInherit(){
            
            System.out.println("In Parent contrsuctor");
        }
}
class DemoChild extends DemoInherit{

    int a=30;
         DemoChild(){
            
            System.out.println("in Child contructor");
         }
}
class Maininherit{

    public static void main(String args[]){
    DemoChild dc=new DemoChild();
    System.out.println("value of child " +dc.a);
     System.out.println("value of parent " +dc.x);
      System.out.println("value of parent " +dc.y);
}

}


