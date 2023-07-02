package com.nemo.rental.repo;

import com.nemo.rental.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
