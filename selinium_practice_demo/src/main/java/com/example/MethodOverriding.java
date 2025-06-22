package com.example;

public class MethodOverriding {

    void fun(int x, int y){
        System.out.println("Value int-int" + x +y);
    }
    
    void fun(float b, float c){
        System.out.println("In float-float" + b + c);
    }

    void fun( int x, float c){
        System.out.println("in int-float"+ x +c);
    }


public static void main(String args[])
{
    MethodOverriding sc=new MethodOverriding();

    sc.fun(10, 10);
    sc.fun(20.2f, 30.2f);
    sc.fun(10, 20.7f);
}
}
