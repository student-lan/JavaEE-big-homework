package org.example.service;

import org.example.dao.DeleteDAO;
import org.example.dao.ProduceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DelProServiceImpl implements DelProService {

    @Autowired
    private DeleteDAO deleteDAO;

    @Override
    public Boolean delPro(int id) {
        Integer i = deleteDAO.selPro(id);//获取要删除的商品id
        if(i!=null){                    //判断商品是否存在
            if(deleteDAO.delPro(id)){   //判断是否删除商品
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }

    }
}
