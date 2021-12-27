package model;

import java.util.Random;

public class Coin {
    boolean side;

    public Coin() {
        side = false;
    }

    //MODIFIES: this
    //EFFECTS: Flips the coin
    public void flip() {
        Random random = new Random();
        side = random.nextBoolean();
    }

    //EFFECTS: Returns false if tails and true if heads
    public boolean checkStatus() {
        return side;
    }
}
