package com.junho.util;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.junho.dto.LeagueEntry;

public class LeagueEntryParser {
	
	public LeagueEntry getJsonData(String id) {
		ObjectMapper objectMapper = new ObjectMapper();
				
		String requestURL 	= "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/"+ id + "?api_key=" + Key.API_KEY;
		LeagueEntry leagueEntry = null;
		
		try {
			HttpClient client = HttpClientBuilder.create().build(); // HttpClient 생성
			HttpGet getRequest = new HttpGet(requestURL); //GET 메소드 URL 생성
			HttpResponse response = client.execute(getRequest);
	
			//Response 출력
			if (response.getStatusLine().getStatusCode() == 200) {
				ResponseHandler<String> handler = new BasicResponseHandler();
				String body = handler.handleResponse(response);
				body = body.substring(1, body.length()-1);
				
				leagueEntry = objectMapper.readValue(body, LeagueEntry.class);   // String to Object로 변환
				 		
			} else {
				System.out.println("response is error : " + response.getStatusLine().getStatusCode());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return leagueEntry;
	}
}
