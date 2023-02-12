package com.example.vehicles.controller;

import com.example.vehicles.model.dtos.VehicleDTO;
import com.example.vehicles.repository.service.VehicleService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vehicle")
public class VehicleController {

    private final VehicleService addressService;

    @ApiOperation(value = "Get all vehicles", notes="Display all vehicles")
    @GetMapping
    public List<VehicleDTO> getVehicles() {
        return addressService.getVehicles();
    }

    @ApiOperation(value = "Find vehicle by id", notes="Provide information about vehicle by id")
    @GetMapping("/{id}")
    public VehicleDTO getVehicleById(@ApiParam(value = "Unique id of vehicle", example = "1") @PathVariable("id") Long id) {
        return addressService.getVehicleById(id);
    }

    @ApiOperation(value = "Add vehicle", notes="Add vehicle to database")
    @PostMapping
    public VehicleDTO addVehicle(@RequestBody VehicleDTO addressDTO) {
        return addressService.addAddress(addressDTO);
    }

    @ApiOperation(value = "Datele vehicle", notes="Delete vehicle from database")
    @DeleteMapping("/{id}")
    public void deleteVehicle(@ApiParam(value = "Unique id of vehicle", example = "1") @PathVariable("id") Long id) {
        addressService.deleteAddress(id);
    }

}
