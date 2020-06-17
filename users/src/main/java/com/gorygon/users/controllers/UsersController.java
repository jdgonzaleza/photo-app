package com.gorygon.users.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

	@RequestMapping(value = "/status/check", method = RequestMethod.GET)
	public String status() {
		return "check";
	}
}
