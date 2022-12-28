import java.util.Scanner;

public class Lab02_Q2 {

    public static void main(String[] args) {

    //question
        System.out.println("Enter the odometer reading of the car in kilometers: ");

    //input stuff

        double kilometers;
        Scanner keyboardInput = new Scanner(System.in);
        kilometers = keyboardInput.nextDouble();

    //percentages
        final long oilPercentage = 30;
        final long batteryPercentage = 15;
        final long brakesPercentage = 25;
        final long tiresPercentage = 13;
        final long otherPercentage = 17;

    //percentages_kilometers

        double kilometers_price = kilometers * 0.1;
        double oil_price = oilPercentage * kilometers_price / 100;
        double battery_price = batteryPercentage * kilometers_price / 100;
        double brakes_price = brakesPercentage * kilometers_price / 100;
        double tires_price = tiresPercentage * kilometers_price / 100;
        double other_price = otherPercentage * kilometers_price / 100;

    //output stuff
        System.out.println("*************************************************");
        System.out.printf("%5s%38s%6s%n","*****","Maintenance Cost Distribution Table","*****");
        System.out.println("*************************************************");
        System.out.printf("%-20s%-1s%2s%18.2f%8s%n","*Oil Change","%",oilPercentage,oil_price,"*");
        System.out.printf("%-20s%-1s%2s%18.2f%8s%n","*Battery","%",batteryPercentage,battery_price,"*");
        System.out.printf("%-20s%-1s%2s%18.2f%8s%n","*Brakes","%",brakesPercentage,brakes_price,"*");
        System.out.printf("%-20s%-1s%2s%18.2f%8s%n","*Tire","%",tiresPercentage,tires_price,"*");
        System.out.printf("%-20s%-1s%2s%18.2f%8s%n","*Other","%",otherPercentage,other_price,"*");
        System.out.printf("%-20s%-1s%16.2f%8s%n","*","TOTAL",kilometers_price,"*");
        System.out.println("*************************************************");

        keyboardInput.close();

    }
}
