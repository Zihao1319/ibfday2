package day2_workshop;

import java.util.LinkedList;
import java.util.List;

public class DiamondCards {

    public static void main (String[] args) {

        List <Cards> diamondCards = new LinkedList<>();
        
        for (int i = 2; i <= 13; i++) {
            Cards diamonds = new Cards ();
            diamonds.setNumber(i);
            diamonds.setColour ("red");
            diamonds.setPattern(Integer.toString(i));
            diamonds.setSuit("diamonds");

            if (i == 11) {
                diamonds.setPattern("K");
            } else if (i == 12) {
                diamonds.setPattern("Q");
            } else if (i == 13) {
                diamonds.setPattern("J");
            }

            diamondCards.add(diamonds);
        }

        for (Cards i: diamondCards) {
            System.out.printf("%s of %s\n", i.getPattern(), i.getSuit());
        }

    }
    
}
