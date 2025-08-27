package org.example.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString(callSuper = true)
@Log
public class PowerStone extends Stone{

    private static final String COLOR = "Purple";
    private static final String NAME = "Power";
    private static final String LOCATION = "In the ORBE";
    private static final int ENERGY_LAVEL = 6;

    public PowerStone(){
        super(COLOR, NAME, LOCATION, ENERGY_LAVEL);
    }
    @Override
    public void usePower(){
        System.out.println("Increment power & Energy " + super.toString());
    }

}
