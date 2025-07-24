package com.ashupanda.fullstack_backend_springboot_java.repository;

import com.ashupanda.fullstack_backend_springboot_java.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
