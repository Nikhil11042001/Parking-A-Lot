package com.demo.enums;

import com.demo.dto.parkingSpot.Compact;
import com.demo.dto.parkingSpot.Large;
import com.demo.dto.parkingSpot.Mini;

public enum ParkingSpotEnum {
    COMPACT(Compact.class),
    MINI(Mini.class),
    LARGE(Large.class);

    private Class parkingSpot;

    ParkingSpotEnum(Class parkingSpot){
        this.parkingSpot= parkingSpot;
    }

    public Class getParkingSpot(){
        return parkingSpot;
    }
}
