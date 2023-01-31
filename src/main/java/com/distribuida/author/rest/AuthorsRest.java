package com.distribuida.author.rest;

import com.distribuida.author.db.Authors;

import com.distribuida.author.service.AuthorsService;


import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/authors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthorsRest {
    @Inject
    AuthorsService service;

    @GET
    public List<Authors> findAll() {
        return service.findAll();
    }
    @GET
    @Path("/{id}")
    public Authors findById(@PathParam("id") Long id) {

        return service.findById(id);
    }

    @POST
    public void create(Authors author) {

        service.create(author);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {

        service.deleteById(id);
    }

    @PUT
    @Path("/{id}")
    public void update(@PathParam("id") Long id, Authors authors) {
        service.update(id, authors);

    }

}