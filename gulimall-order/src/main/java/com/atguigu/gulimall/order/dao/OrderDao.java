package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hfq
 * @email 1184586992@qq.com
 * @date 2020-07-14 23:07:59
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
