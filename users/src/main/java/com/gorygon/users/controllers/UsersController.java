package com.gorygon.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private Environment env;

	@RequestMapping(value = "/status/check", method = RequestMethod.GET)
	public String status() {
		return "working on " + env.getProperty("local.server.port");
	}
}
