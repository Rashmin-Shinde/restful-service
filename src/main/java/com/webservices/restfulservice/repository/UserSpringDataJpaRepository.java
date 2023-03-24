package com.webservices.restfulservice.repository;

import com.webservices.restfulservice.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSpringDataJpaRepository extends JpaRepository<User, Integer> {
}
