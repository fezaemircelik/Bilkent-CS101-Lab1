import java.util.Scanner;

public class Lab06_rev {

    static int countDigits(int input){
        int i = input;
        int z = 0;
        while (i > 0){
            i = i/10;
            z++;
        }
        if (input == 0){
            return 1;
        }
        else{
            return z;
        }
    }

    static int power(int x, int y){
        int i = 1;
        int a = 1;
        while (i <= y){
            a = a*x;
            i++;
        }

        return a;
    }

    static boolean isDisarium(int input){
        int sum = 0;
        int n = countDigits(input);
        int nn = countDigits(input);
        int i = 1;
        int input2 = input;
        while (i <= nn){
            int digit = input % 10;
            int digit_p = power(digit, n);
            sum = sum + digit_p;   
            n--;
            input = input / 10;
            i++;     
        }
        if (sum == input2){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number to be examined: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        
        if (isDisarium(input) == true){
            System.out.println(input + " is a Disarium Number.");
        }
        else {
            System.out.println(input + " is not a Disarium Number.");
        }

        in.close();
    }
}