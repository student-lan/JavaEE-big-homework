package org.example.dao;

import org.example.Produce;
import org.example.Content;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduceDAO {
   //显示指定商品
   public Produce selPro(int id);
   //购买商品id
   public Integer selProByPrice(Integer id);
   //购买商品价格
   public Integer selBuyPri(int contentId);
   //显示所有商品
   public List<Content> showAll();
}
