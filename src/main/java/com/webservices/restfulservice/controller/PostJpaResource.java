package com.webservices.restfulservice.controller;

import com.webservices.restfulservice.bean.Post;
import com.webservices.restfulservice.bean.User;
import com.webservices.restfulservice.exception.PostNotFoundException;
import com.webservices.restfulservice.exception.UserNotFoundException;
import com.webservices.restfulservice.repository.PostSpringDataJpaRepository;
import com.webservices.restfulservice.repository.UserSpringDataJpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PostJpaResource {
//    @Autowired
    private UserSpringDataJpaRepository repository;
//    @Autowired
    private PostSpringDataJpaRepository postRepository;

    public PostJpaResource(UserSpringDataJpaRepository repository, PostSpringDataJpaRepository postRepository) {
        this.repository = repository;
        this.postRepository = postRepository;
    }

    @GetMapping("/jpa/users/{userId}/posts/{postId}")
    public Post retrieveUser(@PathVariable Integer userId, @PathVariable Integer postId){
        Optional<User> user = repository.findById(userId);

        if(user.isEmpty())
            throw new UserNotFoundException("User with Id: " + userId);

        Optional<Post> post = postRepository.findById(postId);
        if (post.isEmpty())
            throw new PostNotFoundException("Post Not Found with Id: " + postId);
    return post.get();
    }
}
