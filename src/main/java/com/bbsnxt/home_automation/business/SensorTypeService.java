package com.bbsnxt.home_automation.business;

import com.bbsnxt.home_automation.infrastructure.entity.SensorType;
import com.bbsnxt.home_automation.infrastructure.repository.SensorTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SensorTypeService {

    private final SensorTypeRepository sensorTypeRepository;

    public SensorType crateSensorType(String name, String description){
        SensorType sensorType = SensorType.builder()
                .name(name)
                .description(description)
                .build();

        return sensorTypeRepository.save(sensorType);
    }

    public SensorType getSensorTypeById(Long id){
        return sensorTypeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tipo de Sensor não encontrado."));
    }
}
