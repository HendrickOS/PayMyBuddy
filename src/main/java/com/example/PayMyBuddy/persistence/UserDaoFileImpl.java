package com.example.PayMyBuddy.persistence;

import java.util.List;

import com.example.PayMyBuddy.domain.UserEntity;

//@Component
public class UserDaoFileImpl implements UserDao {

	@Override
	public UserEntity save(UserEntity user) {
		System.out.println("HELLO WORLD");
		return null;
	}

	@Override
	public List<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
