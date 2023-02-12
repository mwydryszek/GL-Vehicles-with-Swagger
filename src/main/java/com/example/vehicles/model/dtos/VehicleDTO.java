package com.example.vehicles.model.dtos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@ApiModel("Vehicle")
public class VehicleDTO {

    @ApiModelProperty("unique id of vehicle")
    private Long id;
    private Integer productionYear;
    @ApiModelProperty("vehicle identification number")
    private String vin;
    private String brand;
    private String model;

}
