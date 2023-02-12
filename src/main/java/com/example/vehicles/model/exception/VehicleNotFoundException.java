package com.example.vehicles.model.exception;

public class VehicleNotFoundException extends RuntimeException{

    public VehicleNotFoundException() {
        super("Vehicle not found");
    }
}
