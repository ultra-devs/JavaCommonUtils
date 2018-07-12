package com.dev.util.json;


import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flipkart.zjsonpatch.JsonDiff;

public class JsonComparison {

	/*public static void main(String[] args) throws JsonProcessingException, IOException {
		// TODO Auto-generated method stub
		
		  
		JsonNode jsonNode=compareJson("{\"a\": 0,\"b\": [1,2]}", "{\"a\": 0,\"b\": [1,2]}");
		
		 
	}*/
	
	public static JsonNode compareJson(String source,String target ) throws JsonProcessingException, IOException
	{
		
		 
		ObjectMapper jackson = new ObjectMapper(); 
		  JsonNode beforeNode = jackson.readTree(source); 
		  JsonNode afterNode = jackson.readTree(target); 
		  JsonNode patchNode = JsonDiff.asJson(beforeNode, afterNode); 
		  //String diff = patchNode;
		  return patchNode;
		  /*if(patchNode.size()==0)
		  {
			System.out.println("Success: No difference were identified");  
		  }
		  else
		  {
			  System.out.println(patchNode.toString());
			  	  
		  }*/
		
	}

}
