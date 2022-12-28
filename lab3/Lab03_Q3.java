import java.util.Scanner;

import java.util.Locale;

public class Lab03_Q3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        in.useLocale(Locale.US);

        String UserPIN;
        UserPIN = "1234";
        double balance_in_account = 1000.0;

        System.out.print("Enter your PIN: ");
        String inputPIN = in.nextLine();

        if (inputPIN.equals(UserPIN))
        {
            System.out.println("1- Withdraw money");
            System.out.println("2- Open a new account");
            System.out.println("3- Change PIN ");
            System.out.print("Select an operation: ");

            
            int input2;
            input2 = in.nextInt();

            if (input2 == 1)
            {
                System.out.print("Enter the amount to withdraw: ");
                
                double withdrawMoney = in.nextDouble();

                double new_balance = balance_in_account - withdrawMoney;
            
                System.out.print("Your new baalnce is " + new_balance + " TRY. Bye!");
            }
            else if (input2 == 2)
            {
                System.out.println("1- TRY");
                System.out.println("2- USD");
                System.out.print("Select currency type: ");

                int input2_1;
                input2_1 = in.nextInt();
                
                if (input2_1 == 1)
                {
                    System.out.println("Your new TRY account is now opened! Bye!");
                }

                else if (input2_1 == 2)
                {
                    System.out.println("Your new USD account is now opened! Bye!");
                }
            }
            else if (input2 == 3)
            {
                System.out.print("Enter your new PIN: ");

                String newPIN;
                newPIN = in.next();

                System.out.println("Your PIN is changed to " + newPIN.substring(0, 1) + "**" + newPIN.substring(3, 4) + ". Bye!");
            }

        }
        else
        {
            System.out.println("Invalid PIN! Bye!");
        }

        in.close();

    }


}
