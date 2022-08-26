package com.miaowu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("blog") // 指定表名，不指定默认为类的下划线命名
public class Blog {
    @TableId(type = IdType.AUTO) // 标识主键，不标默认为id
    private Integer id;
    private String title;
    private String summary;
    private String content;
    private Boolean author;
    private Date createTime;
    private Date updateTime;
}
