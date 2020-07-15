package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.atguigu.gulimall.product.service.CategoryBrandRelationService;
import com.atguigu.gulimall.product.service.ProductAttrValueService;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("华为手机,P40Pro");
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功...");
    }

    @Test
    void modifyBrand() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("中国华为手机");
        brandService.updateById(brandEntity);
        System.out.println("更新成功...");
    }

    @Test
    void listBrand() {
//        List<BrandEntity> list = brandService.list(new QueryChainWrapper<BrandEntity>().eq("brand_id", 1L));
//        list.forEach((o)->{
//            System.out.println(o.getName());
//        });
//        System.out.println("保存成功...");
    }



}
