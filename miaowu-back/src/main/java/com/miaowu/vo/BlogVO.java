package com.miaowu.vo;

import lombok.Data;

@Data
public class BlogVO {
    private Integer page = 1;
    private Integer size = 5;
    private Boolean author;
    private String title;
}
