package com.bbsnxt.home_automation.infrastructure.repository;

import com.bbsnxt.home_automation.infrastructure.entity.SensorType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorTypeRepository extends JpaRepository<SensorType, Long> {
}
