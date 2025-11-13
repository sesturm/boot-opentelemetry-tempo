package io.opentelemetry.example.flight.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.opentelemetry.example.flight.repository.entity.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {

	List<Flight> findByOriginIgnoreCase(String origin);
}
