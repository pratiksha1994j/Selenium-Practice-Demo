package com.example;

import java.util.*;
public class ArrayListUserInput {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        List <Integer> arr= new ArrayList<>();

        int n = sc.nextInt();
        System.out.println(" enter the number of array " + n); //size of array you have to use
          
        for(int i=0;i<=n;i++){
            int value=sc.nextInt(); //enter the value into array
            arr.add(value); //it will add the value into list
        }
         arr.add(40); // added the element extra after beyond the size array list 
        System.out.println("The array Element are this " + arr); //print the array list with added extra values

        System.out.println("Is given element available = " + arr.contains(40));
        System.out.println("Return element available at given index = " + arr.get(0));
        System.out.println("remove the ele = " + arr.remove(1));
        System.out.println("replace the perticular ele = " + arr.set(2, 90));
        System.out.println("check array is empty = " + arr.isEmpty());
        System.out.println("The size of array = " + arr.size());

        System.out.println("The array Element after method run = " + arr);
    }
    
}
