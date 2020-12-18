package org.example.service;

import org.example.Account;
import org.example.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccServiceImpl implements AccService {

   @Autowired
   private AccountDAO accountDAO;

    @Override
    public List<Account> selAcc(int id) {
        List<Account> list = new ArrayList<Account>(accountDAO.selAcc(id));
        return list;
    }
}
