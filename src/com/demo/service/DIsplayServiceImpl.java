package com.demo.service;

import com.demo.dto.DisplayBoard;
import com.demo.dto.ParkingEvent;
import com.demo.enums.ParkingEventType;
import com.demo.enums.ParkingSpotEnum;
import com.demo.interfaces.DisplayService;
import com.demo.interfaces.Observer;

public class DIsplayServiceImpl implements DisplayService, Observer {

    @Override
    public void update(ParkingSpotEnum parkingSpotEnum, int i) {
        Integer currentCount = DisplayBoard.getInstance().getFreeParkingSpots().get(parkingSpotEnum);
        if(currentCount == null)
        {
            currentCount=0;
        }
        int newCount= currentCount+ i;
        DisplayBoard.getInstance().getFreeParkingSpots().replace(parkingSpotEnum, newCount);

    }

    @Override
    public void update(ParkingEvent event) {
        int currentCount = DisplayBoard.getInstance().getFreeParkingSpots().get(event.getParkingSpotEnum());
        int change=0;
        if(event.getEventType().equals(ParkingEventType.ENTRY)){
            change=-1;
        }
        else{
            change=1;
        }
        int newCount= currentCount+ change;
        DisplayBoard.getInstance().getFreeParkingSpots().replace(event.getParkingSpotEnum(), newCount);
        return;
    }
}
