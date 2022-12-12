package com.trabajo.api.apirest.control;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabajo.api.apirest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
