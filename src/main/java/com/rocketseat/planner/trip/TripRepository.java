package com.rocketseat.planner.trip;

import com.rocketseat.planner.link.Link;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TripRepository extends JpaRepository<Trip, UUID> {
}

