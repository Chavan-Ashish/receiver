package com.hackerearth.service.transaction;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackerearth.receiver.model.Transaction;
import com.hackerearth.receiver.utility.EncryptionUtility;

@Service
public class TransactionService {
	List<Transaction> transactions = new ArrayList<>();
	
	public boolean addTransaction(String encryptedString) throws JsonMappingException, JsonProcessingException, JSONException{
		String response = EncryptionUtility.decrypt(encryptedString);
		JSONObject obj = new JSONObject(response);
		ObjectMapper mapper = new ObjectMapper();
		Transaction transaction = mapper.readValue(obj.get("transaction").toString(), Transaction.class);
		return transactions.add(transaction);
	}

}
