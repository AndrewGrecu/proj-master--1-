package edu.guilford;

import java.util.ArrayList;

public class Card {
    // attributes
    private String suit;
    private String rank;
    private int value;
    
    
    // constructor
    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }
    
    // methods
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    
    public String toString() {
        return rank + " of " + suit;
    }
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
    
        // Instantiate an array to store cards
        Card[] hand = new Card[6];
    
        // Add the first card to the array
        hand[0] = deck.draw();
    
        for (int i = 1; i < 5; i++) {
            hand[i] = deck.draw();
        }
    
        hand[5] = deck.draw();
    
        // Print out all cards in the array
        for (int i = 0; i < hand.length; i++) {
            System.out.println(hand[i]);
        }
    
        // Analysis
        int numAces = 0;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getRank().equals("Ace")) {
                numAces++;
            }
        }
        System.out.println("Number of Aces in hand: " + numAces);
    }

}

