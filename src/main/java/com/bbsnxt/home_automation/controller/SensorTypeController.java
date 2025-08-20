package com.bbsnxt.home_automation.controller;

import com.bbsnxt.home_automation.business.SensorTypeService;
import com.bbsnxt.home_automation.infrastructure.entity.SensorType;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sensor-types")
public class SensorTypeController {

    private final SensorTypeService sensorTypeService;

    @PostMapping
    public SensorType createSensorType(
            @RequestParam String name,
            @RequestParam(required = false) String description
    ){
        return sensorTypeService.crateSensorType(name, description);
    }

}
