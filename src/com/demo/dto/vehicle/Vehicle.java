package com.demo.dto.vehicle;

import com.demo.enums.ParkingSpotEnum;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Vehicle {
    private static final AtomicInteger x = new AtomicInteger(0);
    private int id;
    private ParkingSpotEnum parkingSpotEnum;

    Vehicle(ParkingSpotEnum parkingSpotEnum){
        this.parkingSpotEnum=parkingSpotEnum;
        id = x.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParkingSpotEnum getParkingSpotEnum() {
        return parkingSpotEnum;
    }

    public void setParkingSpotEnum(ParkingSpotEnum parkingSpotEnum) {
        this.parkingSpotEnum = parkingSpotEnum;
    }
}
