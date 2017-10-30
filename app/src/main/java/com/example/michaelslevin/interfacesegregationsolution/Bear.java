package com.example.michaelslevin.interfacesegregationsolution;

import java.util.ArrayList;

/**
 * Created by michaelslevin on 30/10/2017.
 */

public class Bear implements Bearable {

    private ArrayList<Edible> belly = new ArrayList<Edible>();

    public String sleep(){
        return "zzz";
    }


    public int foodCount(){
        return belly.size();
    }
    public boolean isBellyFull(){
        return (foodCount() >= 5);
    }


    public void eat(Edible food){
        if (!isBellyFull()) {
            belly.add(food);
        }
    }


}
