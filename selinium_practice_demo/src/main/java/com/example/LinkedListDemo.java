package com.example;
import java.util.*;

public class LinkedListDemo {
   
    public static void main(String args[]){

        List <Object> ll =new LinkedList();

                  ll.add(10);
                  ll.add(20);
                  ll.add(30);

                //ll.addFirst(50); //add given element at first index 
                //ll.addLast(00); // add given elememnt at last
               System.out.println(ll.getFirst()); //not returned value
                ll.getLast();   //

                //  System.out.println("the elements in list =" + ll);
    }}
