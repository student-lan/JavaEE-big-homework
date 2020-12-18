package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmitDAO {
    //添加商品
    public Boolean submit(@Param("title") String title, @Param("abstracts")String abstracts,@Param("text")String text,@Param("icon")String icon, @Param("price")int price);
    //指定商品编辑页
    public Product selProd(int id);
    //编辑商品
    public Boolean updProd(Product product);
}
