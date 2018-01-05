package com.java2novice.restful;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONObject;

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
	 
	 @POST
	 @Path("/orders")
	  @Consumes(MediaType.APPLICATION_JSON)
	  public JSONObject sayPlainTextHello(JSONObject inputJsonObj) throws Exception {

	    String input = (String) inputJsonObj.get("input");
	    String output = "The input you sent is :" + input;
	    JSONObject outputJsonObj = new JSONObject();
	    outputJsonObj.put("output", output);

	    return outputJsonObj;
	  }
	 
	 @POST
	    @Path("/order2")
	    @Consumes(MediaType.APPLICATION_JSON)
	    public Response getUsersById(List<Order> inputOrderList){
	         
		 
		 for (Order inputOrder : inputOrderList) {
			
		
	        System.out.println("Received order from :"+inputOrder.getCustmer());
	        System.out.println("Order worth: "+inputOrder.getAmount());
	        System.out.println("Customer address: "+inputOrder.getAddress());
		 }
	        return Response.status(200).entity("Your order is in-progress").build();
	    }

}
