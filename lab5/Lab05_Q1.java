import java.util.Scanner;

public class Lab05_Q1 {
    public static void main(String[] args) {
        System.out.print("Please enter city plan string: ");

        Scanner in = new Scanner(System.in);
        String input = in.next();
        int lengthOfInput = input.length();

        int max = Integer.MIN_VALUE;
        int max_changing = Integer.MIN_VALUE;

        String x = "*";
        String space = " ";

        for (int i = 0; i < lengthOfInput; i++){    //for finding the biggest digit
            String blabla = input.substring(i, i + 1);
            int blablaInt = Integer.parseInt(blabla);
            if (blablaInt > max){
                max = blablaInt;
                max_changing = blablaInt;
            }
        }

        String blabla = "";
        int maxChangingMinusOne = 0;

        for (int z = 1; z <= max; z++){

            for (int i = 0; i < lengthOfInput; i++){
                blabla = input.substring(i, i + 1);
                int blablaInt = Integer.parseInt(blabla);

                maxChangingMinusOne = max_changing - 1;

                if (maxChangingMinusOne< 0){
                    maxChangingMinusOne = 0;                    
                }



                if (blablaInt == max_changing){
                    System.out.print(x);
                }
                else {
                    System.out.print(space);
                }
            }            
            input = input.replace(Integer.toString(max_changing), Integer.toString(maxChangingMinusOne));
            max_changing--;
            System.out.println();

        }
        in.close();

        
    }
    
}
