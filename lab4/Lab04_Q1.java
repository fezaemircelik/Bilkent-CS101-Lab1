import java.util.Scanner;

public class Lab04_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input n: ");
        int input = in.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;
        int i = 1;

        if (input == 1){
            c = 1;
        }
        else {
        while ( i < input )
        {
            i++;

            c = a + b;
            a = b;
            b = c;
        }
        }

        System.out.println("Fib(" + input + ") is " + c);

        

        in.close();
    }
}
