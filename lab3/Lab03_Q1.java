import java.util.Scanner;

import java.util.Locale;

public class Lab03_Q1 {
    
    public static void main(String[] args) {


        //input 

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        double weight;

        System.out.println("Enter your weigth in kilograms: ");
        weight = in.nextDouble();

        double height;

        System.out.println("Enter your height in meters: ");
        height = in.nextDouble();

        //calculations for BMI

        double BMI;
        BMI = weight / (height * height);

        double underweight = 18.5;
        double healthy = 25;
        double overweight = 30;

        String BMIresult;
        if (BMI < underweight)
        {
            BMIresult = "underweight";
        }
        else if (underweight <= BMI && BMI < healthy)
        {
            BMIresult = "healthy";
        }
        else if (healthy <= BMI && BMI < overweight)
        {
            BMIresult = "overweight";
        }
        else {
            BMIresult = "obese";
        }

        //output
        System.out.print("Your BMI is ");
        System.out.printf("%.2f" , BMI);
        System.out.print(" and you are in the category of " + BMIresult + ".");


        in.close();

    }
}
