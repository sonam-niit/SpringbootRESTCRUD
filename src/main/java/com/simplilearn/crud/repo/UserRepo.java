package com.simplilearn.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.crud.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
