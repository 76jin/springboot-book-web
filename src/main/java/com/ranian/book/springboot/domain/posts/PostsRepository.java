package com.ranian.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ranian129@gmail.com on 2020-02-24
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
