package day2_workshop;

public class Cards {

    //members
    protected String suit;
    protected int number;
    protected String colour;
    protected String pattern;

    // constructors
    public Cards() {
    }

    public Cards (String suit, int number, String colour, String pattern) {
        this.suit = suit; //hearts, diamonds, spades, clubs
        this.number = number; // 2-13
        this.pattern = pattern; // same as number including k,q,j
        this.colour = colour; 
    }

    public Cards (String suit, int number, String pattern) {
        this.suit = suit; //hearts, diamonds, spades, clubs
        this.number = number; // 2-13
        this.pattern = pattern; // same as number including k,q,j
    }

    // getters and setters
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "Card(name%s, suit=%s, value=%d)".formatted (this.pattern, this.suit, this.number);
    }

    
}
