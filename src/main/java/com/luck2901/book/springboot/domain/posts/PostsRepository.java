package com.luck2901.book.springboot.Domain1.posts;

import com.luck2901.book.springboot.Domain1.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}

//Entity클래스와 기본 Entity Repository는 함께 위치해야 함.
