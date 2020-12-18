package org.example.dao;

import org.example.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDAO {
    //查询用户账务
    List<Account> selAcc(int id);
}
