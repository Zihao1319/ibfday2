package day2_workshop;

import java.util.LinkedList;
import java.util.List;

public class HeartCards extends Cards {

    @Override
    public String toString() {
        return suit + number + pattern;
    }

    public static void main (String[] args) {

        List <Cards> heartCards = new LinkedList<>();
        
        for (int i = 2; i <= 13; i++) {
            Cards hearts = new Cards ();
            hearts.setNumber(i);
            hearts.setColour ("red");
            hearts.setPattern(Integer.toString(i));
            hearts.setSuit("hearts");

            if (i == 11) {
                hearts.setPattern("K");
            } else if (i == 12) {
                hearts.setPattern("Q");
            } else if (i == 13) {
                hearts.setPattern("J");
            }

            heartCards.add(hearts);
        }

        for (Cards i: heartCards) {
            System.out.printf("%s of %s\n", i.getPattern(), i.getSuit());
        }

    }
}
