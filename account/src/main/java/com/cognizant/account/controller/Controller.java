package com.cognizant.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.Entity.Account;

@RestController
@RequestMapping("/account")
public class Controller {
	@Autowired
	private Account ac;
	@GetMapping("/{number}")
	public Account getDetails(@PathVariable("number") String number)
	{
		ac.setNumber(number);
		ac.setType("saving");
		return ac;
	}
	

}
