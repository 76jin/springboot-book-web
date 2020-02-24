package com.ranian.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by ranian129@gmail.com on 2020-02-24
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
