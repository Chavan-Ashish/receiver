package com.hackerearth.receiver.restcontroller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hackerearth.service.transaction.TransactionService;

@RequestMapping("/transaction/")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@PostMapping("/add")
	public JSONObject addTransaction(@RequestBody String data) {
		try {
			transactionService.addTransaction(data);
			JSONObject response = new JSONObject();
			response.put("result", "success");
			return response;
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("result", "failure");
			return response;
		}
	}
}
