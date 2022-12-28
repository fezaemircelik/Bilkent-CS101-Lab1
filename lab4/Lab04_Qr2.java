import java.util.Scanner;

public class Lab04_Qr2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int input;
        input = in.nextInt();

        int i = input;
        int j = 0;

        String inputs;
        String output = "";

        System.out.println();

        while (j<input){
            i = input - j;
            output = "";
            while (i > 0){
                inputs = Integer.toString(input - j);
                output = output + inputs;


                i--;
        }
        System.out.println(output);
        j++;
        }

        in.close();
    }
    
}
