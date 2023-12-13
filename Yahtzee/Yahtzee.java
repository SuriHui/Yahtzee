public class Yahtzee
{
    Die6[] dice = new Die6[5];
    /**
     * Constructor for objects of class Dice
     */
    public Yahtzee()
    {
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die6;
        }
    }
    
    public void roll() {
        for (int i = 0; i < dice.length; i++) {
            dice[i].roll();
        }
    }
    
    public int getValue() {
        return dice[0].getValue()+dice[1].getValue()+dice[2].getValue()+dice[3].getValue()+dice[4].getValue();
    }
    
    public int rollAndGetValue() {
        roll();
        return getValue();
    }
    
    public void roll(int dieNumber) {
        for (int count = 0; count <= 3; count++) {
            if (dieNumber == 1) {
                die1.roll();
            } else if (dieNumber == 2) {
                die2.roll();
            } else if (dieNumber == 3) {
                die3.roll();
            } else if (dieNumber == 4) {
                die4.roll();
            } else if (dieNumber == 5) {
                die5.roll();
            } else if (count > 3) {
                System.out.print("YOU CANNOT REROLL MORE THAN 3 TIMES!!!");
            }
        }
    }
    
    public void summarize() {
        String[] strDie = {"1 - ","2 - ","3 - ","4 - ","5 - "};
        for (int value = 0; value < strDie.length; value++) {
            System.out.println(strDie[value]);
        }
    }
    
    public String toString() {
        String dieStr = "Dice Values: " + die1.getValue() + " " + die2.getValue() + " " + die3.getValue() + " " + die4.getValue() + " " + die5.getValue();  
        return dieStr;
    }
}
