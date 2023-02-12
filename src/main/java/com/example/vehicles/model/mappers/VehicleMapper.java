package com.example.vehicles.model.mappers;


import com.example.vehicles.model.dtos.VehicleDTO;
import com.example.vehicles.model.VehicleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    VehicleEntity mapToEntity(VehicleDTO vehicleDTO);

    VehicleDTO mapToDTO(VehicleEntity vehicleEntity);

}
