package com.gorygon.accountmanagement.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

	@RequestMapping(value = "/status/check", method = RequestMethod.GET)
	public String status() {
		return "Accounts working";
	}
}
