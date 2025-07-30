package com.example.moviereview.repository;

import com.example.moviereview.model.Review;
import com.example.moviereview.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {
    List<Review> findByUser(User user);
}
