package edu.guilford;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //create a card
        Card card = new Card("Hearts", "Ace", 1);
        System.out.println(card);

        //create a deck
        Deck deck = new Deck();
        System.out.println(deck);

        


    }
    

    
    
}
