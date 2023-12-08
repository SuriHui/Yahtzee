public class Yahtzee
{
    Die6 die1;
    Die6 die2;
    Die6 die3;
    Die6 die4;
    Die6 die5;
    /**
     * Constructor for objects of class Dice
     */
    public Yahtzee()
    {
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6(); 
        die5 = new Die6();
    }
    
    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }
    
    public int getValue() {
        return die1.getValue()+die2.getValue()+die3.getValue()+die4.getValue()+die5.getValue();
    }
    
    public int rollAndGetValue() {
        roll();
        return getValue();
    }
    
    public int roll(int dieNumber) {
        int count = 0;
        count++;
        for (count = 0; count <= 3; count++) {
            if (dieNumber == 1) {
                die1.roll();
                return getValue();
            } else if (dieNumber == 2) {
                die2.roll();
                return getValue();
            } else if (dieNumber == 3) {
                die3.roll();
                return getValue();
            } else if (dieNumber == 4) {
                die4.roll();
                return getValue();
            } else if (dieNumber == 5) {
                die5.roll();
                return getValue();
            } else if (count > 3) {
                System.out.print("YOU. SPECIFICALLY YOU CANNOT REROLL MORE THAN 3 TIMES!!!");
            }
        }
        return getValue();
    }
}