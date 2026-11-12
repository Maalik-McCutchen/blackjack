package com.pluralsight;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your name player 1: ");
        String playerOne = myScanner.nextLine();

        System.out.println("Enter your name player 2: ");
        String playerTwo = myScanner.nextLine();

        Hand playerOneHand = new Hand();
        Hand playerTwoHand = new Hand();
        Deck deck = new Deck();
        deck.shuffle();

        Card firstCard = deck.deal();
        playerOneHand.deal(firstCard);

        Card secondCard = deck.deal();
        playerTwoHand.deal(secondCard);

        Card thirdCard = deck.deal();
        playerOneHand.deal(thirdCard);

        Card fourthCard = deck.deal();
        playerTwoHand.deal(fourthCard);



    }
}
