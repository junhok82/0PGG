package com.junho.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.junho.dto.ChampionMastery;

public class ChampionMasteryParser {

	public List<ChampionMastery> getJsonData(String id) {
		ObjectMapper objectMapper = new ObjectMapper();
		
		// 공백 처리
		String Summonerid = id.replaceAll(" ", "%20");
		
		String requestURL = "https://kr.api.riotgames.com/lol/champion-mastery/v4/champion-masteries/by-summoner/"+ Summonerid + "?api_key=" + Key.API_KEY;
		List<ChampionMastery> championMasteryList = new ArrayList<>();
		
		try {
			HttpClient client = HttpClientBuilder.create().build(); // HttpClient 생성
			HttpGet getRequest = new HttpGet(requestURL); //GET 메소드 URL 생성
			HttpResponse response = client.execute(getRequest);
	
			//Response 출력
			if (response.getStatusLine().getStatusCode() == 200) {
				ResponseHandler<String> handler = new BasicResponseHandler();
				String body = handler.handleResponse(response);
				
				/* 문자열 정규화 */
				body = body.replaceAll("[}][,][{]", "}@{").trim();
				body = body.substring(1, body.length()-1);
				String[] str = body.split("@");
				
				for(String s : str) {
					ChampionMastery championMastery = objectMapper.readValue(s, ChampionMastery.class);   // String to Object로 변환
					championMasteryList.add(championMastery);
				}
					 		
			} else {
				System.out.println("response is error : " + response.getStatusLine().getStatusCode());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return championMasteryList;
	}
}
