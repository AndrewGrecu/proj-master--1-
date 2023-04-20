package edu.guilford;

import java.util.Random;

public class Deck {
    //attributes
    private Card[] cards;
    private int size; // here is my 4th attribute, im not sure if its required for it to be in the same class
    
    //constructor
    public Deck() {
        cards = new Card[52];
        size = 0;
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards[size] = new Card(suits[i], ranks[j], j + 1);
                size++;
            }
        }
    }

    

    //methods
    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //draw a card
    public Card draw() {
        Card card = cards[0];
        for (int i = 0; i < size - 1; i++) {
            cards[i] = cards[i + 1];
        }
        size--;
        return card;
    }

    // toString
    public String toString() {
        String str = "";
        for (int i = 0; i < size; i++) {
            str += cards[i] + " ";
        }
        return str;
    }
    private void swap(int i, int j) {
        Card temp = cards[i];
        cards[i] = cards[j];
        cards[j] = temp;
    }
    public void shuffle() {
        Random rand = new Random();
        for (int i = size - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            swap(i, j);
        }
    }

}
