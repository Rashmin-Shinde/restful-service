package com.webservices.restfulservice.repository;

import com.webservices.restfulservice.bean.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostSpringDataJpaRepository extends JpaRepository<Post, Integer> {
}
