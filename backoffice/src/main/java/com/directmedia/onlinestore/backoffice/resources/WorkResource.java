/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.backoffice.resources;

import com.directmedia.onlinestore.core.Startup;
import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalog;
import com.directmedia.onlinestore.core.entity.Work;
import java.util.Set;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author alema
 */

@Path("/work")
public class WorkResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Work> liste() {
        Startup.main();
        return Catalog.listOfWork;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Work get(@PathParam("id") Long id) {
        return Catalog.getWorkById(id);
    }
    
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public Response add(
            @FormParam("title") String title,
            @FormParam("genre") String genre,
            @FormParam("release") int release,
            @FormParam("summary") String summary,
            @FormParam("mainArtist") String mainArtist
        ) {
        Work w = new Work();
        w.setTitle(title);
        w.setGenre(genre);
        w.setRelease(release);
        w.setSummary(summary);
        Artist a = new Artist(mainArtist);
        w.setMainArtist(a);
        Catalog.listOfWork.add(w);
        return Response.status(Response.Status.CREATED).entity(w.getId()).build();
    }
    
    @PUT
    @Path("/{id}")
    public Response update(
            @PathParam("id") long id,
            @FormParam("title") String title,
            @FormParam("genre") String genre,
            @FormParam("release") int release,
            @FormParam("summary") String summary,
            @FormParam("mainArtist") String mainArtist
        ) {
        Work w = Catalog.getWorkById(id);
        w.setTitle(title);
        w.setGenre(genre);
        w.setRelease(release);
        w.setSummary(summary);
        w.getMainArtist().setName(mainArtist);
        return Response.status(Response.Status.OK).build();
    }
    
    
    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
        Catalog.listOfWork.removeIf(w -> w.getId()==id);
        return Response.status(Response.Status.OK).build();
    }
}
