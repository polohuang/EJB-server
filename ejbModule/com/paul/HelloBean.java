package com.paul;

import java.util.List;

import javax.ejb.Stateless;

import com.paul.model.User;

/**
 * Session Bean implementation class HelloBean
 */
@Stateless
public class HelloBean implements Hello {

    /**
     * Default constructor. 
     */
    public HelloBean() {
    }

	@Override
	public String sayHello(String name) {
		return "Hello " + name + " !";
	}

}
