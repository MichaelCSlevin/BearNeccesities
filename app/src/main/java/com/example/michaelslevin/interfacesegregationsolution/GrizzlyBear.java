package com.example.michaelslevin.interfacesegregationsolution;

/**
 * Created by michaelslevin on 30/10/2017.
 */

public class GrizzlyBear extends Bear implements NorthAmerican {

    public GrizzlyBear() {
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
        return "I'm on a rock!";
    }

    @Override
    public String climbTrees() {
        return "I'm climbing a tree and haven't fallen down like a stupid panda!";
    }
}
