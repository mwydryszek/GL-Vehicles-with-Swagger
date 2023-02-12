package com.example.vehicles.service;

import com.example.vehicles.model.exception.VehicleNotFoundException;
import com.example.vehicles.repository.VehicleRepository;
import com.example.vehicles.model.VehicleEntity;
import com.example.vehicles.model.dtos.VehicleDTO;
import com.example.vehicles.model.mappers.VehicleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;
    private final VehicleMapper vehicleMapper;

    @Override
    public VehicleDTO getVehicleById(Long id) {
        return vehicleRepository.findById(id).stream()
                .map(vehicleMapper::mapToDTO)
                .findFirst()
                .orElseThrow(VehicleNotFoundException::new);
    }

    @Override
    public List<VehicleDTO> getVehicles() {
        return vehicleRepository.findAll().stream()
                .map(vehicleMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public VehicleDTO addAddress(VehicleDTO addressDTO) {
        VehicleEntity address = vehicleRepository.save(vehicleMapper.mapToEntity(addressDTO));
        return vehicleMapper.mapToDTO(address);
    }

    @Override
    public void deleteAddress(Long id) {
        vehicleRepository.deleteById(id);
    }
}
