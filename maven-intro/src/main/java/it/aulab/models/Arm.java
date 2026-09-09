package it.aulab.models;

import it.aulab.Side;

public class Arm {
    private Side side;

    public Arm(Side side) {
        this.side = side;
    }


    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public void attack(Side side) {
        System.out.println("Attacco con il braccio " + side);
    }

}
