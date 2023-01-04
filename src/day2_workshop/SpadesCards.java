package day2_workshop;

import java.util.LinkedList;
import java.util.List;

public class SpadesCards {

    public static void main (String[] args) {

        List <Cards> spadesCards = new LinkedList<>();
        
        for (int i = 2; i <= 13; i++) {
            Cards spades = new Cards ();
            spades.setNumber(i);
            spades.setColour ("black");
            spades.setPattern(Integer.toString(i));
            spades.setSuit("spades");

            if (i == 11) {
                spades.setPattern("K");
            } else if (i == 12) {
                spades.setPattern("Q");
            } else if (i == 13) {
                spades.setPattern("J");
            }

            spadesCards.add(spades);
        }

        for (Cards i: spadesCards) {
            System.out.printf("%s of %s\n", i.getPattern(), i.getSuit());
        }

    }
}

    

