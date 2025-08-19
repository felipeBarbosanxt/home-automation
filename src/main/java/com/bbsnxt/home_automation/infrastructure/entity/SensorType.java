package com.bbsnxt.home_automation.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "sensor_type")
@Entity
public class SensorType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sensorTypeId;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "description")
    private String description;

    // Um tipo de sensor pode ter vários sensores
    @OneToMany(mappedBy = "sensorType")
    private List<Sensor> sensors;

}
