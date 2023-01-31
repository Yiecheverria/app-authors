package com.distribuida.author.dao;

import com.distribuida.author.db.Authors;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AuthorsDao implements PanacheRepository<Authors> {
}
