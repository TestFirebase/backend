package com.example.teamdev.ProjectPFE.repository;

import com.example.teamdev.ProjectPFE.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
