import java.util.Scanner;

public class Lab04_Qr1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.print("Please input n: ");
        int n;
        n = in.nextInt();

        System.out.print("Please input m: ");
        int m;
        m = in.nextInt();

        int input;

        int i = 0;
        double sum = 0;
        
        System.out.print("Please input a positive integer: ");
        input = in.nextInt();

        while (n <= input && input <= m){
            
            if (n < input && input < m){
                if (input < min){
                    min = input;
                }
                if (input > max){
                    max = input;
                }
                
                i++;
                sum = sum + input;
            }
            else if (input == n){
                min = input;
            }
            else if (input == m){
                max = input;
            }
            System.out.print("Please input a positive integer: ");
            input = in.nextInt();


        }
        double avarage = sum / i;


        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Avarage: " + avarage);

        in.close();
    }
}
