package com.second.blog.repository;

import com.second.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PostRepository extends CrudRepository<Post,Long > {

}
