package com.jesselisa;

public class Main {

    public static void main(String[] args) {

        for (int x = 1; x < 4; x++) {
            int suit = x;
            int value = 0;

            for (int y = 1; y < 14; y ++) {
                value = y;
                Card newcard = new Card (suit, value);
                System.out.println(newcard);
            }
        }
    }
}
