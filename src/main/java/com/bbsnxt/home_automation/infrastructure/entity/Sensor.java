package com.bbsnxt.home_automation.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "sensor")
@Entity
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sensorId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "localization")
    private String localization;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private StatusType statusType;

    @ManyToOne
    @JoinColumn(name = "sensor_type_id", nullable = false)
    SensorType sensorType;
}
