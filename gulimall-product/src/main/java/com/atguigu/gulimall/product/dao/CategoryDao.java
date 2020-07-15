package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hfq
 * @email 1184586992@qq.com
 * @date 2020-07-14 19:13:26
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
