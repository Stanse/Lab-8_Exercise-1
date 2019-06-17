package com.mybank.domain;

public class OverdraftException extends Exception {
    private double deficit;

    public double getDeficit(){
        return deficit;
    }

    public OverdraftException(String msg, double aDeficit){
        super(msg);
        deficit = aDeficit;
    }
}
