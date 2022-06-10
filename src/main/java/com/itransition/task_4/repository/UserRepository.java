package com.itransition.task_4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.itransition.task_4.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	@Query(value="select * from users u where u.email= :email and status=true", nativeQuery=true)
	User findByEmail(String email);
	void deleteById(Long id);
}
