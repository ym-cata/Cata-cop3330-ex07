/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("What is the length of the room in feet?"); //asks user to input length
      double length=sc.nextDouble();
      System.out.println("What is the width of the room in feet?"); //asks user to input width
      double width=sc.nextDouble();
      System.out.println("You entered dimension of "+length+" by "+width+" feet");


      double area=length*width; //calculates area of room by multiplying 
      final double conversionFactor=area*0.09290304; //uses formula for conversion 


      System.out.println("The area is");
      System.out.println(area+" square feet");
      System.out.println(conversionFactor+" square meters"); // prints area in square feet and meters
   }
}