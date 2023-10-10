package io.opentelemetry.example.flight.repository.entity;

import lombok.Data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
