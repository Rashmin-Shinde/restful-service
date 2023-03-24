package com.webservices.restfulservice.repository;

import com.webservices.restfulservice.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
