package com.turf.turf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turf.turf.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer>{
    
}
