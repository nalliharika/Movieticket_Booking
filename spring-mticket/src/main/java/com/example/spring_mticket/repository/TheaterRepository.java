package com.example.spring_mticket.repository;

import com.example.spring_mticket.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository
        extends JpaRepository<Theater, Long> {
}
