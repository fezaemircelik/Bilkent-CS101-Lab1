import java.util.Scanner;


public class Lab04_Q3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please input n: ");
        int n = in.nextInt();

        System.out.println("Now input " + n + " positive integers: ");
        int i = 0;
        int p_n;
        double sum = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        while (i < n ){       
            i++;                 //takes 'n' input
            p_n = in.nextInt();

            sum = sum + p_n;

            if (p_n > max){     //calculates if input is max or min
                max = p_n;
            }
            if (p_n < min){
                min = p_n;
            }
        }

        in.close();

        System.out.println("Min: " + min);      //output
        System.out.println("Max: " + max);
        System.out.println("Avarage: " + sum/n);

        
    }
    
}
