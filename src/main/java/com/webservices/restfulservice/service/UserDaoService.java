package com.webservices.restfulservice.service;

import com.webservices.restfulservice.bean.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount,"Krishna", LocalDate.now().minusYears(34)));
        users.add(new User(++usersCount,"Vrinda", LocalDate.now().minusYears(13)));
        users.add(new User(++usersCount,"Gau", LocalDate.now().minusYears(38)));
    }
    public List<User> findAll(){
        return users;
    }

    public User findOne(Integer id){
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public void deleteById(Integer id){
        Predicate<User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }
}
