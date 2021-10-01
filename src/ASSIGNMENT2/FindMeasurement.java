package ASSIGNMENT2;

import java.util.Scanner;

public class FindMeasurement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter valus in centimeters");
        double cm=input.nextDouble();
        double inch= cm/2.54;//1 in=2.54cm
        double feet= cm*0.0328;//1 cm=0.0328 feet
        System.out.println(cm + " centimeter "+ " is " + inch+"inch");
        System.out.println(cm + " centimeter "+ " is " + feet +"feet");
    }
}