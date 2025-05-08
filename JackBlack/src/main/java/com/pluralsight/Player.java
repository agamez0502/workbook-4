package com.pluralsight;

public class Player {

    //creating variables
    private String name;
    private Hand hand;

    //constructor
    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    //getters
    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public int getHandValue(){
        return hand.getValue();
    }
}
