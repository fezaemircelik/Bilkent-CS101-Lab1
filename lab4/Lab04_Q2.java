import java.util.Scanner;

public class Lab04_Q2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the string: ");
        String input = in.next();

        String reverseInput = "";

        int length = input.length();

        int i = length ;

        while (i > 0)
        {
            i--;
            reverseInput = reverseInput + input.charAt(i);
        }

        if (reverseInput.equals(input)){
            System.out.println("It is a palindrome.");
        }
        else
        {
            System.out.println("It is not a palindrome.");
        }
        in.close();
    }
    
}
