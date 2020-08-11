package com.baizhi.git2001_repository.dao;

import com.baizhi.git2001_repository.entity.Category;

import java.util.List;

public interface CategoryDao {

    List<Category> queryAll();


    List<Category> queryById();

}
