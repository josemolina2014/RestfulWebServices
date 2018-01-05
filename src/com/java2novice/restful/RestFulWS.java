package com.java2novice.restful;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.java2novice.model.Order;

@Path("/service")
public class RestFulWS 
{
	
	 @POST
	    @Path("/order")
	    @Consumes(MediaType.APPLICATION_JSON)
	    public Response getUserById(Order inputOrder){
	         
	        System.out.println("Received order from :"+inputOrder.getCustmer());
	        System.out.println("Order worth: "+inputOrder.getAmount());
	        System.out.println("Customer address: "+inputOrder.getAddress());
	         
	        return Response.status(200).entity("Your order is in-progress").build();
	    }

}
