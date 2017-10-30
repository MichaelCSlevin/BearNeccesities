package com.example.michaelslevin.interfacesegregationsolution;

/**
 * Created by michaelslevin on 30/10/2017.
 */

public class PandaBear extends Bear implements Chinese {

    public PandaBear() {

    }

    @Override
    public Bamboo harvestBamboo() {
        return new Bamboo();
    }

    @Override
    public String climbTree() {
        return "I've climbed this tree oops I fell.";
    }
}
