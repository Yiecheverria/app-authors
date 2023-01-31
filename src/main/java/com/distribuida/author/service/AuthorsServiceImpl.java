package com.distribuida.author.service;

import com.distribuida.author.dao.AuthorsDao;
import com.distribuida.author.db.Authors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import java.util.List;

@ApplicationScoped
@Transactional
public class AuthorsServiceImpl implements AuthorsService {

    @Inject private AuthorsDao authorsDao;

    @Override
    public List<Authors> findAll() {
        return authorsDao.findAll().list();
    }

    @Override
    public Authors findById(Long id) {
        return authorsDao.findById(id);
    }

    @Override
    public void create(Authors authors) {
        authorsDao.persistAndFlush(authors);
    }

    @Override
    public void deleteById(Long id) {
        authorsDao.deleteById(id);
    }

    @Override
    public void update(Long id, Authors author) {
       authorsDao.update("UPDATE Author SET first_name = ?1, last_name = ?2 WHERE id = ?3",
                author.getFirstName(),
                author.getLastName(),
                id);
    }
}
