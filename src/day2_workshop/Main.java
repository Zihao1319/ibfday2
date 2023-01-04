package day2_workshop;

public class Main {

    public static void main (String[] args) {
        DeckOfCards deck = new DeckOfCards();

        System.out.printf(">> before: %s\n", deck);

        deck.shuffle();
        System.out.printf(">> after: %s\n", deck);

    }
    
}
