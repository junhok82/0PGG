package com.junho.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.junho.dto.ChampionLotation;
import com.junho.dto.ChampionMastery;
import com.junho.dto.Summoner;
import com.junho.util.ChampionLotationParser;
import com.junho.util.ChampionMasteryParser;
import com.junho.util.SummonerParser;

@RestController
@CrossOrigin(origins= {"*"}, maxAge=6000)
public class Controller {

	@GetMapping(value = "/summoner/{name}")
	public ResponseEntity<Summoner> summoner(@PathVariable String name) {
		
		// 소환사 정보
		SummonerParser summonerParser = new SummonerParser();
		Summoner summoner = summonerParser.getJsonData(name);
		
		// 숙련도 정보 
		String id = summoner.getId();
		ChampionMasteryParser championMasteryParser = new ChampionMasteryParser();
		List<ChampionMastery> championMasteryList = championMasteryParser.getJsonData(id);
		
//		for(ChampionMastery c : championMasteryList)
//			System.out.println(c.toString());
		
		
		// 로테이션 정보
		ChampionLotationParser championLotationParser = new ChampionLotationParser();
		ChampionLotation championLotation = championLotationParser.getJsonData();
		
//		System.out.println(championLotation.toString());
		
		if(summoner != null && !summoner.equals(null)) {
			return new ResponseEntity<Summoner>(summoner,HttpStatus.OK);
		}
		return new ResponseEntity<Summoner>(HttpStatus.NO_CONTENT);
	}
}
