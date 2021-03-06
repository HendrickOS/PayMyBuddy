package com.example.PayMyBuddy.persistence;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.PayMyBuddy.domain.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

	UserEntity findByUsername(String username);

	Optional<UserEntity> findById(Integer id);
}
