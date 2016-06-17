package th.in.lordgift.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import th.in.lordgift.api.bean.*;

@Path("Services")
public class Services {

	@GET
	@Path("{id}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public void get(@PathParam("id") Integer id) {
		System.out.println("GET:"+id);
	}
	
	@POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Appdata create(Appdata entity) {
		System.out.println("POST:"+entity);
		return entity;
    }

    @PUT
    @Path("{id}")
    @Consumes( {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Appdata edit(@PathParam("id") Integer id, Appdata entity) {
    	System.out.println("POST:"+entity);
    	return entity;
    }
    
}
