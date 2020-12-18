package org.example.service;

import org.example.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccService {
   public List<Account> selAcc(int id);
}
