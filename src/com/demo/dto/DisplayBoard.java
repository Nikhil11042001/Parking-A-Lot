package com.demo.dto;

import com.demo.enums.ParkingSpotEnum;

import java.util.List;
import java.util.Map;

public class DisplayBoard {

    private static DisplayBoard displayBoard=null;
    private Map<ParkingSpotEnum , Integer> freeParkingSpots;

    public static DisplayBoard getInstance(){
        if(displayBoard==null)
            displayBoard = new DisplayBoard();
        return displayBoard;
    }

    public Map<ParkingSpotEnum, Integer> getFreeParkingSpots() {
        return freeParkingSpots;
    }
}
