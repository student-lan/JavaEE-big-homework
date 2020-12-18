package org.example.service;

import org.example.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmitService {
    public Product submit(String title, String abstracts, String text, String icon, int price);
    public Product selProd(int id);
    public Product updEdit(Product product);
}
