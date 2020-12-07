package com.bjpowernode.mapper;

import com.bjpowernode.domain.Category;

import java.io.Serializable;

public interface CategoryMapper {
    //连接查询
    Category get(Serializable id);
    //嵌套(分布)查询
    Category get2(Serializable id);
}
