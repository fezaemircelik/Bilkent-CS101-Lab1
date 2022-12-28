import java.util.Scanner;

public class Lab04_Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of lines: ");
        int input;
        input = in.nextInt();
        String x = "*";
        String output = "";

        while (input > 0){
            output = output + x;
            input--;

            System.out.println(output);
            
        }
        
        in.close();
    }
}
