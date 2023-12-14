public class Yahtzee
{
    Die6[] dice = new Die6[5];
    /**
     * Constructor for objects of class Dice
     */
    public Yahtzee()
    {
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die6();
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
                dice[0].roll();
            } else if (dieNumber == 2) {
                dice[1].roll();
            } else if (dieNumber == 3) {
                dice[2].roll();
            } else if (dieNumber == 4) {
                dice[3].roll();
            } else if (dieNumber == 5) {
                dice[4].roll();
            } else if (count > 3) {
                System.out.print("YOU CANNOT REROLL MORE THAN 3 TIMES!!!");
            }
        }
    }
    
    public String summarize() {
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        for (int i = 0; i < dice.length - 1; i++) {
           if (dice[i].getValue() == 1) {
               ones++;
           } else if (dice[i].getValue() == 2) {
               twos++;
           } else if (dice[i].getValue() == 3) {
               threes++;
           } else if (dice[i].getValue() == 4) {
               fours++;
           } else if (dice[i].getValue() == 5) {
               fives++;
           }
        }
        return "1 - " + ones + ", 2 - " + twos + ", 3 - " + threes + ", 4 - " + fours + ", 5 - " + fives;
    }
    
    public String toString() {
        String dieStr = "Dice Values: " + dice[0].getValue() + " " + dice[1].getValue() + " " + dice[2].getValue() + " " + dice[3].getValue() + " " + dice[4].getValue();  
        return dieStr;
    }
}