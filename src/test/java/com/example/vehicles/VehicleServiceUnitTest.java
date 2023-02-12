package com.example.vehicles;

import com.example.vehicles.model.dtos.VehicleDTO;
import com.example.vehicles.repository.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@RequiredArgsConstructor
public class VehicleServiceUnitTest {

    private final VehicleService vehicleService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<VehicleDTO> vehicles = vehicleService.getVehicles();

        Assert.assertEquals(vehicles.size(), 3);
    }
}