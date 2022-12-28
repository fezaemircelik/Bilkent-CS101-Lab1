import java.util.Scanner;

import java.util.Locale;

public class Lab02_Q1 {
    public static void main(String[] args) {

    //input stuff

        Scanner keyboardInput = new Scanner(System.in);

        keyboardInput.useLocale(Locale.US);

        double width;

        System.out.println("Enter the width of the rectangle: ");
        width = keyboardInput.nextDouble();

        double height;

        System.out.println("Enter the height of the rectangle: ");
        height = keyboardInput.nextDouble();

    //equations for the diagonal of rectangle

        double width_s = Math.pow(width,2);
        double height_s = Math.pow(height,2);

        double diagonal = Math.sqrt(width_s + height_s);

        
    //answers

        System.out.printf("%-40s%2s%10.3f%n","The area of the rectangle is", ":", height * width);
        System.out.printf("%-40s%2s%10.3f%n","The circumference of the rectangle is",":", 2*(height + width));
        System.out.printf("%-40s%2s%10.3f%n","The diagonal of the rectangle is",":", diagonal);

        keyboardInput.close();
       }
    
}