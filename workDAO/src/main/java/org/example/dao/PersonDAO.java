package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.Person;
import org.springframework.stereotype.Repository;



@Repository
public interface PersonDAO {
    //用户登录
    public Person findByName(@Param("userName") String userName, @Param("password") String password);

}
