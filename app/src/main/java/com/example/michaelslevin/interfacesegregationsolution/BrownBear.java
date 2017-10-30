package com.example.michaelslevin.interfacesegregationsolution;

/**
 * Created by michaelslevin on 30/10/2017.
 */

public class BrownBear extends Bear implements NorthAmerican {
    public BrownBear() {
    }


    @Override
    public Salmon riverFish() {
        return new Salmon();
    }

    @Override
    public Honey harvestHoney() {
        return new Honey();
    }

    @Override
    public String climbRocks() {
        return "Look at me, I'm on a rock!";
    }

    @Override
    public String climbTrees() {
        return "I'm better at climbing trees than grizzlies and pandas!";
    }
}
