package com.bbsnxt.home_automation.infrastructure.repository;

import com.bbsnxt.home_automation.infrastructure.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public class SensorRepository extends JpaRepository<Sensor, Long> {
}
