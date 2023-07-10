package com.nemo.rental.repo;

import com.nemo.rental.model.UserPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPostRepo extends JpaRepository<UserPost, Long> {
}
