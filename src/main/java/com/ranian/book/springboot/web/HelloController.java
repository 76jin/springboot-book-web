package com.ranian.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ranian129@gmail.com on 2020-02-24
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
