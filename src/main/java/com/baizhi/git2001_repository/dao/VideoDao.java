package com.baizhi.git2001_repository.dao;

import com.baizhi.git2001_repository.entity.Video;

import java.util.List;

public interface VideoDao {

    List<Video> queryById(String id);
}
