package org.example.service;

import org.example.Content;
import org.example.Produce;
import org.example.dao.ProduceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShwProServiceImpl implements ShwProService {

    @Autowired
    private ProduceDAO produceDAO;

    @Override
    public Produce selPro(int id) {
        Produce produce = produceDAO.selPro(id);//获取指定商品信息
        if (produce!=null){
           Integer buyprice = produceDAO.selBuyPri(id);//获取当前商品购买价格
            if(buyprice!=null){  //判断是否存在
                produce.setBuyPrice(produceDAO.selProByPrice(id));
                produce.setIsBuy(1);
                produce.setIsSell(1);
            }else {
                produce.setIsBuy(0);
                produce.setIsSell(0);
            }
        }else {
            return null;
        }
        return produce;


    }

    @Override
    public List<Content> showAll() {
        List<Content> list = produceDAO.showAll();
        return list;
    }
}
