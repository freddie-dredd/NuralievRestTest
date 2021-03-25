package com.example.demo.service;

import com.example.demo.model.Blog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class BlogServiceImpl implements BlogService{

    private static final Map<Integer, Blog> BLOG_MAP = new HashMap<>();
    private static final AtomicInteger BLOG_ID_HOLDER = new AtomicInteger();


    @Override
    public void create(Blog blog) {
        final int blogId = BLOG_ID_HOLDER.incrementAndGet();
        blog.setId(blogId);
        BLOG_MAP.put(blogId, blog);
    }

    @Override
    public Blog read(int id) {
        return new ArrayList<>(BLOG_MAP.values());
    }

    @Override
    public boolean delete(int id) {
        return BLOG_MAP.remove(id) != null;
    }
}
