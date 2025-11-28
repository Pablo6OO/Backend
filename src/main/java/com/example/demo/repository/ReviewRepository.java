package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
