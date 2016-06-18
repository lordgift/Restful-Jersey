package th.in.lordgift.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import th.in.lordgift.api.bean.Appdata;

@Path("Services")
public class Services {

    @GET
    @Path("getIt")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @GET
    @Path("getQueryParam")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String getQueryParam(@QueryParam("param") String param) {
        return "Got QueryParam="+param+"!";
    }
    
    
    @POST
    @Path("getFormParam")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String getFormParam(@FormParam("param") String param) {
        return "Got FormParam="+param+"!";
    }
    
	@POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Appdata create(Appdata entity) {
		System.out.println("POST:"+entity);
		return entity;
    }
    
}
