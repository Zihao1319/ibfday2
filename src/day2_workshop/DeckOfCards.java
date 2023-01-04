package day2_workshop;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {

    private List<Cards> deck;
    
    public DeckOfCards () {
        this.deck = new LinkedList<>();

        for (int i = 0; i < Constants.SUIT.length; i++) {
            String suit = Constants.SUIT[i];

            for (int j = 0; j < Constants.NUMBERS.length; j++) {
                Integer number = Constants.NUMBERS[j];
                String pattern = Constants.PATTERN[j];
                Cards card = new Cards (suit, number, pattern);
                deck.add(card);
            }
        }
        System.out.println(deck);
    }

    public void shuffle() {

        for (int curr = 0; curr < deck.size(); curr++) {
            Random rand = new SecureRandom();
            int toSwap = rand.nextInt(deck.size());
            Cards c = deck.get(curr);
            Cards d = deck.get(toSwap);
            deck.set(curr,d);
            deck.set(toSwap,c);
        }
    }

    @Override
    public String toString() {
        return "DeckOfCards [deck=" + deck + "]";
    }
    
}