/**
 * lab02_rev1
 */

import java.util.Scanner;

public class lab02_rev1 {

    public static void main(String[] args) {
        
    
    //question
        System.out.println("Type the side of your equilateral triangle");

    //input
        Scanner in = new Scanner(System.in);
        double side = in.nextDouble();

    //height
        double height = (side / 2 ) * Math.sqrt(3);

    //area
        double area = (side * height) / 2 ;

    //circmuference
        double circumference = side * 3;


    //results
        System.out.printf("%-20s%2s%10.3f%n","height is",":", height);
        System.out.printf("%-20s%2s%10.3f%n","area is",":" , area);
        System.out.printf("%-20s%2s%10.3f%n","circumference is",":", circumference);


        in.close();
    }
}