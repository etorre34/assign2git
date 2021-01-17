package src.com.csc205.activities.activity2.part2;

import src.com.csc205.activities.activity2.part1.Deck;
import src.com.csc205.activities.activity2.part1.StandardDeck;


/**
 * Driver class to demonstrate the use of the deck.
 */
public class DeckDriver {

    public static void main(String[] args) {

     StandardDeck deck = new StandardDeck();
     displayDeck(deck);
     
     deck.shuffle();
     
     displayDeck(deck);
     


    }

    private static void displayDeck(Deck cards) {
        System.out.println(cards);
    }


}
