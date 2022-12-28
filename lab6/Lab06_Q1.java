import java.util.Scanner;

public class Lab06_Q1 {

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
  
    static int sumOfDigits (int input){
        int i = input;
        int sum = 0;
        while(i > 0) {
            int digit = i % 10;
            sum = sum + digit;
            i = i/10;
        }
        return sum;
    }

    static boolean isPerfectSquare(int input){
        double x = Math.sqrt(input);
        if (x == (int)x){
            return true;
        }
        else {
            return false;
        }
    }

    static boolean isFibonacci(int input){
        int f1 = (5 * input * input) + 4;
        int f2 = (5 * input * input) - 4;
        
        if (isPerfectSquare(f1) == true){
            return true;
        }
        else if (isPerfectSquare(f2) == true){
            return true;
        }
        else{
            return false;
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
    
    static boolean isHarshad(int input){
        if (input == 0){
            return false;
        }
        double x = input % sumOfDigits(input);
        if (x == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    static boolean isNarcissistic(int input){
        int sum = 0;
        int i = 1;
        int digitcount = countDigits(input);
        int constantInput = input;
        while ( i <= digitcount){
            int a = input % 10;
            input = input / 10;
            int b = power(a, digitcount);
            sum = sum + b;
            i++;
        }

        if (sum == constantInput){
            return true;
        }
        else {
            return false;
        }
    }

    static boolean isPrime(int input){
        if (input < 2){
            return false;
        }
        int i = 2;
        while (i < input){
            int a = input % i;
            if (a == 0){
                return false;
            }
            else {
                i++;
            }
        }
        return true;
        
    }

    public static void main(String[] args) {
        System.out.print("Enter number to be examined: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        System.out.println("Number of digits: " + countDigits(input));
        System.out.println("Sum of digits: " + sumOfDigits(input));

        if (isFibonacci(input) == true){
            System.out.println(input + " is a Fibonacci number.");
        }
        else {
            System.out.println(input + " is not a Fibonacci number.");
        }

        if (isHarshad(input) == true){
            System.out.println(input + " is a Harshad number.");
        }
        else {
            System.out.println(input + " is not a Harshad number.");
        }

        if (isNarcissistic(input) == true){
            System.out.println(input + " is Narcissistic.");
        }
        else {
            System.out.println(input + " is not Narcissistic.");
        }

        if (isPrime(input) == true){
            System.out.println(input + " is a Prime number.");
        }
        else {
            System.out.println(input + " is not a Prime number");
        }

        in.close();
    }
}