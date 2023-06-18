/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ficdev.apicrud.resources;

/**
 *
 * @author pedroclarindodasilvaneto
 */
import br.edu.ficdev.apicrud.Product;
import br.edu.ficdev.apicrud.ProductDAO;
import java.net.*;
import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/products")
public class ProductResource {

    private ProductDAO dao = ProductDAO.getInstance();

    // RESTful API methods go here...
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> list() {
        return dao.listAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Product product) throws URISyntaxException {
        int newProductId = dao.add(product);
        URI uri = new URI("/products/" + newProductId);
        return Response.created(uri).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response update(@PathParam("id") int id, Product product) {
        product.setId(id);
        if (dao.update(product)) {
            return Response.ok().build();
        } else {
            return Response.notModified().build();
        }
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int id) {
        if (dao.delete(id)) {
            return Response.ok().build();
        } else {
            return Response.notModified().build();
        }
    }

}
