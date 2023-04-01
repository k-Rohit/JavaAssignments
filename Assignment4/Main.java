// Name - Kumar Rohit
// PRN - 20170126052
// Division - AIML - A3


package Assignment4_;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Card card = new Card();
        Vector<Card> deck = new Vector<>(52);
        while (true){
            System.out.println(" ---- Menu driven program ----");
            System.out.println("1. Crate deck");
            System.out.println("2. Display Deck");
            System.out.println("3. Find the card from the same suit");
            System.out.println("4. Compare the card having rank");
            System.out.println("5. Find a particular card");
            System.out.println("6. Deal Card");
            System.out.println("7. Shuffle the deck");
            System.out.println("8. Print card");
            System.out.println("9. Exit from the program");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();


            switch (choice){
                case 1:
                    deck = card.createDeck();
                    break;

                case 2:
                    card.displayDeck(deck);

                case 3:
                    card.sameCard(deck);
                    break;

                case 4:
                    card.clearDeck(deck);
                    break;

                case 5:
                    card.findCard(deck);
                    break;

                case 6:
                    card.dealCard(deck);
                    break;

                case 7:
                    card.shuffleDeck(deck);
                    break;

                case 8:
                    card.printCard(deck);
                    break;

                case 9:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter a valid choice");
            }

        }
    }
}
