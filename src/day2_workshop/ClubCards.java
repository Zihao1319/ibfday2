package day2_workshop;

import java.util.LinkedList;
import java.util.List;

public class ClubCards {

    public static void main (String[] args) {

        List <Cards> clubsCards = new LinkedList<>();
        
        for (int i = 2; i <= 13; i++) {
            Cards clubs = new Cards ();
            clubs.setNumber(i);
            clubs.setColour ("black");
            clubs.setPattern(Integer.toString(i));
            clubs.setSuit("clubs");

            if (i == 11) {
                clubs.setPattern("K");
            } else if (i == 12) {
                clubs.setPattern("Q");
            } else if (i == 13) {
                clubs.setPattern("J");
            }

            clubsCards.add(clubs);
        }

        for (Cards i: clubsCards) {
            System.out.printf("%s of %s\n", i.getPattern(), i.getSuit());
        }

    }
    
    
}
