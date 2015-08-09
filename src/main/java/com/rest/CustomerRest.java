package com.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.domain.Customer;
import com.service.CustomerService;

@Controller
public class CustomerRest {
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/api/getAllCustomer", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
		
	}
	
	@RequestMapping(value = "/api",
            method = RequestMethod.GET,
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.OK)
    public String sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return "Hello" +name;
    }


}
