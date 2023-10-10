package io.opentelemetry.example.flight.model;

import lombok.Data;

import java.util.Date;


public @Data class Flight {

	private String origin;
	private String destination;
	private String airline;
	
	private Date departureTime;

}
