package com.cognizant.loan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.Entity.Loan;


@RestController
@RequestMapping("/loans")
public class Controller {
	@Autowired
	private Loan l;
	@GetMapping("/{number}")
	public Loan getDetails(@PathVariable("number") String number)
	{
		l.setNumber(number);
		l.setType("car");
		l.setLoan(1000000);
		l.setEmi(3500);
		l.setTenure(120);
		return l;
	}
	

}
