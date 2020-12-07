package com.bjpowernode.mapper;

import com.bjpowernode.domain.Goods;

import java.io.Serializable;

public interface GoodsMapper {
    Goods get(Serializable id);
    Goods get2(Serializable id);
}
