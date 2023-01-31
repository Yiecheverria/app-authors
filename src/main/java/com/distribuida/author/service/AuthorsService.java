package com.distribuida.author.service;

import com.distribuida.author.db.Authors;

import java.util.List;

public interface AuthorsService {
    List<Authors> findAll();
    Authors findById(Long id);
    void create(Authors author);
    void deleteById(Long id);
    void update(Long id, Authors author);
}
