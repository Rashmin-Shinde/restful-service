package com.webservices.restfulservice.util;

import com.webservices.restfulservice.bean.Course;
import com.webservices.restfulservice.repository.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    //@Autowired
    //private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Bhagwad Gita", "Krishna"));
        repository.save(new Course(2, "Bhagwatam", "Vyas Dev"));
        repository.save(new Course(3, "Hindu", "Nemade"));
        repository.save(new Course(4, "BG As it is", "Prabhupad"));

        repository.deleteById(3l);

        System.out.println(repository.findAll());
    }
}
