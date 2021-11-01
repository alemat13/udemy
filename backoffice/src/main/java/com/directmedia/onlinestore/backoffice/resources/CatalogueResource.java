/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.backoffice.resources;

import com.directmedia.onlinestore.core.Startup;
import com.directmedia.onlinestore.core.entity.Catalog;
import com.directmedia.onlinestore.core.entity.Work;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author alema
 */

@Path("/catalogue")
public class CatalogueResource {
    @Path("/liste")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Work> liste() {
        Startup.main();
        return Catalog.listOfWork.values();
    }
}
