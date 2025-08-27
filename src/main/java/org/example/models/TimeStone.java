package org.example.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString(callSuper = true)
@Log
public class TimeStone extends Stone{

    private static final String COLOR = "Green";
    private static final String NAME = "Time";
    private static final String LOCATION = "In the EYE of Agamotto";
    private static final int ENERGY_LAVEL = 3;

    public TimeStone(){
        super(COLOR, NAME, LOCATION, ENERGY_LAVEL);
    }

    @Override
    public void usePower(){
        System.out.println("Stop or Speed up Time" + this.toString());
    }
}
