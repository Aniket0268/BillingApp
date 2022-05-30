package com.brainworks.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brainworks.service.IBillingService;

@RestController
@RequestMapping("/api/store")
public class BillingRestController {

	@Autowired
	private IBillingService service; // HAS-A
	
	@GetMapping("/bill/{customerType}/{purchaseAmt}")
	public Double billGenerator(@PathVariable String customerType,@PathVariable Long purchaseAmt) {
		return	service.billOfCustomer(customerType, purchaseAmt);
	
	}
}
