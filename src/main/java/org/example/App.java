package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people?");
        int people = input.nextInt(); //Input
        System.out.println( "How many pizzas do you have?" );
        int pizza = input.nextInt(); //Input
        System.out.println("How many slices per pizza?");
        //Calculations for slices per person and leftover
        int slices = input.nextInt(); //Input
        int totalSlices = (pizza*slices);
        int slicesEach = totalSlices/people;
        int leftover = totalSlices % people;
        System.out.println(people + " people with " + pizza + " pizzas (" + totalSlices + " slices)");//Output
        System.out.println("Each person gets " + slicesEach + " pieces of pizza.");//Output
        System.out.println("There are " + leftover + " leftover pieces.");//Output

    }
}
