package org.example.service;

import org.springframework.stereotype.Repository;

import java.text.ParseException;

@Repository
public interface InsOrdService {
    public Boolean insertOrderPro(int contentId,int personId) throws ParseException;
}
