package com.ps;

public class Dice {
    public static int roll(){
        int maxValue = 20;
        int minValue = 1;
        int randomNumber = (int)(Math.random() * maxValue) + minValue;
        return randomNumber;

    }
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1 = 0, roll2 = 0, twoCount = 0, fourCount=0, sixCount=0, sevenCount=0, res =0;
        for (int j = 1; j<=100; j++) {
            for (int i = 1; i <= 100; i++) {
                roll1 = dice.roll();
                roll2 = dice.roll();
                res = roll1+roll2;
                System.out.println(roll1 + "  "+ roll2 + " Sum: " + res );
            }

            if (res == 2)
                twoCount +=1;
            if (res == 4)
                fourCount+=1;
            if(res==6)
                sixCount +=1;
            if(res == 7)
                sevenCount+=1;
        }
        System.out.println(twoCount + " " + fourCount + " " + sixCount + " " + sevenCount);

    }
}
