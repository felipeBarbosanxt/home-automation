package com.bbsnxt.home_automation.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "reading")
@Entity
public class Reading {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long readingId;

    @Column(name = "value", nullable = false)
    private Double value;

    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;

    // Um sensor pode ter várias leituras
    @ManyToOne
    @JoinColumn(name = "sensor_id", nullable = false)
    private Sensor sensor;

}
