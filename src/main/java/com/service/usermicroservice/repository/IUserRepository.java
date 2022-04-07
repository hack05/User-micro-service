package com.service.usermicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.usermicroservice.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{

}
