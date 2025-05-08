package com.pluralsight;

import java.util.Scanner;

public class CardApp {

    //scanner allows user input
    static Scanner cardScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //create the players
        System.out.print("Enter your name player 1: ");
        Player player1 = new Player(cardScanner.nextLine().trim());

        System.out.print("\nEnter your name player 2: ");
        Player player2 = new Player(cardScanner.nextLine().trim());

        //create the deck
        Deck deck = new Deck();
        deck.shuffle();

        // deal 2 cards from the deck and add them to the hand
        for (int i = 0; i < 2; i++) {
            // get a card from the deck
            Card card1 = deck.deal();
            Card card2 = deck.deal();

            // deal that card to the hand
            player2.getHand().deal(card1);
            player2.getHand().deal(card2);
        }

        int value1 = player1.getHandValue();
        int value2 = player2.getHandValue();

        String name1 = player1.getName();
        String name2 = player2.getName();

        // Determine winner
        if (value1 > 21 && value2 > 21) {
            System.out.println("Both players busted. No winner.");
        } else if (value1 > 21) {
            System.out.println(name2 + " wins!");
        } else if (value2 > 21) {
            System.out.println(name1 + " wins!");
        } else if (value1 > value2) {
            System.out.println(name1 + " wins!");
        } else if (value2 > value1) {
            System.out.println(name2 + " wins!");
        } else {
            System.out.println("It's a tie!");
        }

        //print out the value of all the cards in the hand
        System.out.println(player1.getName() +"'s hand is worth " + player1.getHandValue());
        System.out.println(player2.getName() + "'s hand is worth " + player2.getHandValue());
    }

}