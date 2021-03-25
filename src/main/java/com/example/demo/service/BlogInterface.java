package com.example.demo.service;
import com.example.demo.model.Blog;
import java.util.List;

public interface BlogService {
    void create(Blog blog);

    List<blog> readAll;

    Blog read(int id);

    boolean delete(int id);

}




