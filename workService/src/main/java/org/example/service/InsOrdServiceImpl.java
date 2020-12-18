package org.example.service;

import org.example.Person;
import org.example.dao.OrderDAO;
import org.example.dao.PersonDAO;
import org.example.dao.ProduceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class InsOrdServiceImpl implements InsOrdService {

    @Autowired
    private OrderDAO orderDAO;

    @Override
    public Boolean insertOrderPro(int contentId,int personId) throws ParseException {
        Integer buyprice=orderDAO.ordPri(contentId);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowtime = simpleDateFormat.format(date);
        Date time = simpleDateFormat.parse(nowtime);
        if(orderDAO.insertOrderPro(contentId,personId,buyprice,time)){
            return true;
        }else {
            return false;
        }

    }
}
