package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.User;

public interface HariDAO extends JpaRepository<User, Long> {

	User help(User user);

}
