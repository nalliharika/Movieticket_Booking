package com.example.spring_mticket.repository;

import com.example.spring_mticket.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository
        extends JpaRepository<Booking, Long> {
}
