package com.demo.dto.vehicle;

import com.demo.enums.ParkingSpotEnum;

public class Truck extends Vehicle{
    Truck() {
        super(ParkingSpotEnum.LARGE);
    }
}
