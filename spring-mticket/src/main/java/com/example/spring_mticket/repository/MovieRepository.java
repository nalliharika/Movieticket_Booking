package com.example.spring_mticket.repository;
import com.example.spring_mticket.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository
        extends JpaRepository<Movie, Long> {

}
