import java.util.Scanner;

import java.util.Random;                        //          BLACKJACK GAME

public class Lab05_Q2 {
    public static void main(String[] args) {
            
        String deck_1 = "123456789";
        int length_1 = deck_1.length();
        String deck = "";

        for (int i = 0; i < length_1; i++){         //**showing the deck */
            deck = deck + deck_1.substring(i, i + 1).repeat(4);
        }

        int length = deck.length();

        System.out.println("Starting the game with the following deck: ");
        System.out.println(deck);
        System.out.println();
        System.out.println("Dealer is now dealing cards...");

        Random rand = new Random();

        System.out.println("Player's hand: ");
        
        
        String player = "";

        for (int i = 0; i < 2; i++){            //**picking 2 random cards for player */
            int randomChoice = rand.nextInt(length - 1);
            char blabla = deck.charAt(randomChoice);

            deck = deck.substring(0, randomChoice) + deck.substring(randomChoice + 1,length);
            length = deck.length();
            
            player = player + blabla;
        }
        System.out.println(player);

        System.out.println();
        System.out.println("Dealer's hand: ");

        String dealer = "";

        for (int i = 0; i < 2; i++){            //**picking 2 random cards for dealer */
            int randomChoice = rand.nextInt(length - 1);
            char blabla = deck.charAt(randomChoice);

            deck = deck.substring(0, randomChoice) + deck.substring(randomChoice + 1,length);
            length = deck.length();
            
            dealer = dealer + blabla;
        }
        System.out.println(dealer.substring(0, 1) + "?");

        int sumPlayer;                          //**calculating the sum of players first 2 cards */
        int playerInt = Integer.parseInt(player);
        for (sumPlayer = 0; playerInt > 0; sumPlayer = sumPlayer + playerInt % 10, playerInt = playerInt / 10);

        int sumDealer;                          //**calculating the sum of dealers first 2 cards */
        int dealerInt = Integer.parseInt(dealer);
        for (sumDealer = 0; dealerInt > 0; sumDealer = sumDealer + dealerInt % 10, dealerInt = dealerInt / 10);

        for (int i = 1; i>0;i++)
        {
            System.out.println();
            System.out.println("Please enter your choice: ");
            System.out.println("1) Hit");
            System.out.println("2) Stand");
            
            Scanner in = new Scanner(System.in);
            int input = in.nextInt();

            if (input == 1)     //** means the player has chosen to hit */
            {

                System.out.println("Hit! Dealer is giving the player a card...");
                int randomChoice = rand.nextInt(length - 1);
                char blabla = deck.charAt(randomChoice);

                deck = deck.substring(0, randomChoice) + deck.substring(randomChoice + 1,length);
                length = deck.length();
                
                player = player + blabla;       //** players new deck after hitting */

                System.out.println("Player's hand: ");
                System.out.println(player);

                playerInt = Integer.parseInt(player);
            
                for (sumPlayer = 0; playerInt > 0; sumPlayer = sumPlayer + playerInt % 10, playerInt = playerInt / 10);//** new sum  for the new deck */

                if (sumPlayer == 21)
                {
                    System.out.println("Player scored 21. Player wins! ");
                    i = -1;
                }
                else if (sumPlayer > 21)
                {
                    System.out.println("Player scored over 21. Player lost! ");
                    i = -1;
                }
                else {}
            }
            else if (input == 2)        //** means the player has chosen to stand */
            {
                System.out.println("Stand! Player's turn is now over. Player's hand sums to " + sumPlayer);

                if (sumDealer > sumPlayer){
                    System.out.println("Dealer scored more than player. Dealer wins!");
                }
                else if (sumDealer <= sumPlayer){

                    for (int z = 1; z > 0; z++)
                    {
                        if (sumDealer > 21)
                        {
                            System.out.println("Dealer scored over 21. Dealer lost! ");
                            z = -1;
                        }
                        else if (sumDealer == 21)
                        {
                            System.out.println("Dealer scored 21. Dealer wins! ");
                            z = -1;
                        }
                        else if (sumDealer > sumPlayer)
                        {
                            System.out.println("Dealer scored more than player. Dealer wins! ");
                            z = -1;
                        }
                        else if (sumDealer <= sumPlayer)
                        {
                            int randomChoice = rand.nextInt(length - 1);
                            char blabla = deck.charAt(randomChoice);

                            deck = deck.substring(0, randomChoice) + deck.substring(randomChoice + 1,length);
                            length = deck.length();
                            
                            dealer = dealer + blabla;

                            dealerInt = Integer.parseInt(dealer);
                            for (sumDealer = 0; dealerInt > 0; sumDealer = sumDealer + dealerInt % 10, dealerInt = dealerInt / 10);

                            System.out.println("Dealer's hand: ");
                            System.out.println(dealer);
                        }
                    }

                    i = -1;
                    System.out.println("Ending the game with the following deck: ");
                    System.out.println(deck);

                    in.close();
                }
            }
        }
    }    
}