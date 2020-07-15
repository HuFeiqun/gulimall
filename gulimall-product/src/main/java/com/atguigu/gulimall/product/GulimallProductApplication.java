package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合Mybatis-Plus
 *      1)导入依赖
 *      mybatis-plus
 *
 *      2)配置
 *          1、配置数据源
 *              导入数据库驱动
 *              新建application.yml配置数据源的相关信息
 *          2、配置Mybatis-Plus
 *              使用@MapperScan()
 *              告诉mybatis-plus,sql映射文件位置 （application.yml中间配置）
 *
 */

@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
