package com.compilecraft.pickbot;

import java.util.ArrayList;

/**
 * Created by chris on 2/25/2017.
 */

public class Decision {
    private String name;
    private ArrayList<String> options = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public void addOption(String newOption){
        this.options.add(newOption);
    }
}