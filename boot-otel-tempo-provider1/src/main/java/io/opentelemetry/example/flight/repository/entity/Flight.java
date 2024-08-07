package io.opentelemetry.example.flight.repository.entity;

import lombok.Data;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight")
public @Data class Flight {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	private String origin;
	private String destination;
	private String airline;
	
	@Column(name = "departing")
	private Date departureTime;
}
