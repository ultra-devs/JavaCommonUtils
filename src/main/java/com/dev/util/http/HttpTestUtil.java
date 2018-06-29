package com.dev.util.http;

import java.net.URISyntaxException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HttpTestUtil {
	public static String invokePOSTrequest(String payload, String httpUrl) throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		String response = null;
		try {
			headers.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<String> request = new HttpEntity<String>(payload, headers);

			response = restTemplate.postForObject(httpUrl, request, String.class);
		} catch (Exception e) {
			System.err.println("Exception :" + e);
			response = e.getMessage();
		}

		return response;

	}

	public ResponseEntity invokeGETrequest(String id, String url) {
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		HttpEntity<?> requestEntity = new HttpEntity(headers);
		return restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
	}
}
