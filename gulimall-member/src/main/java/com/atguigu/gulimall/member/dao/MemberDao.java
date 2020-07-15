package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hfq
 * @email 1184586992@qq.com
 * @date 2020-07-15 14:53:09
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
