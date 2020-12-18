package org.example.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface DeleteDAO {
    //确认商品是否存在
    public Integer selPro(int id);
    //删除商品
    public Boolean delPro(int id);
}
