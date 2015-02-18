package com.jesselisa;

/**
 * Created by Jesse on 2/17/2015.
 */

public class Card {
        private String stringName;
        private int suitID;
        private int valueID;

        public Card(int suit, int value) {
                this.suitID = suit;
                this.valueID = value;
                this.stringName = cardString(suit, value);
        }
        private String cardString(int cardId, int suitId){
                if (cardId < 11 && cardId > 1) {
                        String cardNum = String.valueOf(cardId);
                        //todo if else for each suit
                        return cardNum;
                } else if (cardId == 1) {
                        return "Ace";
                } else if (cardId == 11) {
                        return "Jack";
                } else if (cardId == 12) {
                        return "Queen";
                } else if (cardId == 13) {
                        return "King";
                } else {
                        String cardNum = String.valueOf(cardId);
                        return cardNum;
                }
        }
}

