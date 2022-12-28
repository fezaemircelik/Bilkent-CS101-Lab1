import java.util.Scanner;

public class Lab03_Q2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int year;

        System.out.println("Enter the year to be evaluated: ");
        year = in.nextInt();

        int century = ((year - 1) / 100) + 1;


        String leapResult;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    leapResult = "leap year";
                }
                else {
                    leapResult = "not a leap year";
                }
            }    
            else {
                leapResult = "a leap year";
            }
        }
        else {
            leapResult = "not a leap year";
        }

        String centuryResult;
        if (century == 11){
            centuryResult = "th";
        }
        else if (century == 12){
            centuryResult = "th";
        }
        else if (century % 10 == 1){
            centuryResult = "st";
        }
        else if (century % 10 == 2){
            centuryResult = "nd";
        }
        else if (century % 10 == 3){
            centuryResult = "rd";
        }
        else {
            centuryResult = "th";
        }

        System.out.println("The year " + year + " is in the " + century + centuryResult + " century and is " + leapResult + "." );

        in.close();

    }
    
}
