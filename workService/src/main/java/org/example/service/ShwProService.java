package org.example.service;

import org.example.Produce;
import org.example.Content;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShwProService {
    public Produce selPro(int id);
    public List<Content> showAll();
}
