/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngfs.customerinformation;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

/**
 *
 * @author hemel
 */
@Stateless
@Path("/customers")
public class CustomerResource {
    @GET
    public Response GetAll() {
        Customer firstCustomer = new Customer();
        firstCustomer.setId("01");
        firstCustomer.setName("Shahadat Hossain");
        firstCustomer.setAddress("Dhaka,Bangladesh");
        
        Customer secondCustomer = new Customer();
        secondCustomer.setId("01");
        secondCustomer.setName("Shahadat Hossain");
        secondCustomer.setAddress("Dhaka,Bangladesh");
        
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(firstCustomer);
        customers.add(secondCustomer);
        
        GenericEntity<List<Customer>> customersWrapper = new GenericEntity<List<Customer>>(customers){};
        return Response.ok(customersWrapper).build();
    }
}
