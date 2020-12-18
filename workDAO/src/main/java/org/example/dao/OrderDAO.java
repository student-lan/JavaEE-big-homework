package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public interface OrderDAO {
    //查询购买商品的价格
    public Integer ordPri(Integer contentId);
    //购买商品
    public Boolean insertOrderPro(@Param("contentId") int contentId, @Param("personId")int personId, @Param("buyprice")int buyprice,@Param("time") Date time);


}
