package com.example.vehicles.service;

import com.example.vehicles.model.dtos.VehicleDTO;

import java.util.List;

public interface VehicleService {


    VehicleDTO getVehicleById(Long id);

    List<VehicleDTO> getVehicles();

    VehicleDTO addAddress(VehicleDTO addressDTO);

    void deleteAddress(Long id);

}
