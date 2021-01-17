package com.csc205.activities.activity2.part1;

/**
 * Defines the API for a deck of cards.
 * Used for extensibility for other types of decks that you may want to add later.
 */
public interface Deck {

    public void shuffle();
    public void cut(int index);
    public Card deal();
    public Card turnOver();
    public int search();
    public int search(Card card);
    public void newOrder(Deck deck);
    

}
