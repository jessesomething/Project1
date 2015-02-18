package com.jesselisa;
import Java.util.*;

public class Main {

    public static void main() {

        for (int x = 1; x < 4; x++) {
            int suit = x;
            int value;

            for (int x = 1; x < 14; x ++) {
                value = x;
            }
            Card newcard = new Card (suit, value);
            System.out.println(newcard);
        }
    }
}
