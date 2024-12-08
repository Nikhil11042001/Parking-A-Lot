package com.demo.dto.parkingSpot.spotDecorator;

import com.demo.dto.parkingSpot.ParkingSpot;

public class Electric extends SpotDecorator{
    Electric(ParkingSpot parkingSpot) {
        super(parkingSpot);
    }

    @Override
    public int cost(int parkingHours) {
        return parkingSpot.cost(parkingHours)+50;
    }
}
