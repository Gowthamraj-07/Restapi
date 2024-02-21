package com.example.toystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.toystore.model.User;
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    
}
