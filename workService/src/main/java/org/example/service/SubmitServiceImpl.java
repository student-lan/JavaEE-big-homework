package org.example.service;

import org.example.Product;
import org.example.dao.SubmitDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubmitServiceImpl implements SubmitService {

    @Autowired
    private SubmitDAO submitDAO;



    @Override
    public Product submit(String title, String abstracts, String text, String icon, int price) {
        if(submitDAO.submit(title,abstracts,text,icon,price)){
            Product product = new Product();
            product.setAbstracts(abstracts);
            product.setPrice(price);
            product.setText(text);
            product.setTitle(title);
            product.setIcon(icon);
            return product;
        }else {
            return null;
        }
    }

    @Override
    public Product selProd(int id) {
        Product product = submitDAO.selProd(id);
        if(product!=null){
            return product;
        }else {
            return null;
        }
    }

    @Override
    public Product updEdit(Product product) {
        int contentId = product.getId();
        try {
            submitDAO.updProd(product);
            Product product1 = submitDAO.selProd(contentId);
            return product1;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
