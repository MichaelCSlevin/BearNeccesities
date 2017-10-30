package com.example.michaelslevin.interfacesegregationsolution;

/**
 * Created by michaelslevin on 30/10/2017.
 */

public class PolarBear extends Bear implements Arctic {

    public PolarBear() {

    }

    @Override
    public Seal iceFish() {
        return new Seal();
    }

    @Override
    public String climbIceberg() {
        return "I'm on an iceberg!";
    }
}
