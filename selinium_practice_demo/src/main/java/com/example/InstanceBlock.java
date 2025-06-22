package com.example;

public class InstanceBlock {
   int x=10;
   InstanceBlock(){
    System.out.println("in Contsructor");
    System.out.println(x);
   }
   {
    System.out.println("In Instance block");
   }
   void fun(){
      System.out.println("in method");
   }
   public static void main(String args[]){
      InstanceBlock ib=new InstanceBlock();
      ib.fun();
   }
}

