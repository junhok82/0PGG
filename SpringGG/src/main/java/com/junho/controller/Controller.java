package com.junho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.junho.dto.LeagueEntry;
import com.junho.dto.Summoner;
import com.junho.service.SummonerService;
import com.junho.util.LeagueEntryParser;
import com.junho.util.SummonerParser;

@RestController
@CrossOrigin(origins= {"*"}, maxAge=6000)
public class Controller {

	@Autowired
	private SummonerService summonerService;
	
	@GetMapping(value = "/summoner/{name}")
	public ResponseEntity<Summoner> summoner(@PathVariable String name) {
		
		Summoner summoner = new Summoner();
		
		// findByName
		summoner = summonerService.findByName(name);
		try {
			if(summoner.getName().equals(name)) {		
				System.out.println(summoner.getName() + " : DB에서 찾음");
			}
		} catch(Exception e) { 	// DB에 없다면 API에서 소환사 정보 가져오기
			SummonerParser summonerParser = new SummonerParser();
			summoner = summonerParser.getJsonData(name);
			if(summoner != null) {	// API에 정보가 있다면 소환사 정보 DB에 추가
				summonerService.insertSummoner(summoner);
			}
		}
		
		// 리그 정보
		LeagueEntryParser leagueEntryParser = new LeagueEntryParser();
		LeagueEntry leagueEntry = leagueEntryParser.getJsonData(summoner.getId());
		System.out.println("리그 엔트리 : " + leagueEntry.toString());
		
		// 숙련도 정보 
		//String summonerid = summoner.getId();
		//ChampionMasteryParser championMasteryParser = new ChampionMasteryParser();
		//List<ChampionMastery> championMasteryList = championMasteryParser.getJsonData(summonerid);
		
		// 로테이션 정보
		//ChampionLotationParser championLotationParser = new ChampionLotationParser();
		//ChampionLotation championLotation = championLotationParser.getJsonData();		
		//System.out.println("챔피언 로테이션 정보 : " + championLotation.toString());
		
		// 전적 리스트
		//String accountId = summoner.getAccountId();
		//MatchListParser matchListParser = new MatchListParser();
		//MatchList matchList = matchListParser.getJsonData(accountId);
		//System.out.println("전적 리스트 : " + matchList.toString());
		
		
		// 현재 게임정보
		// CurrentGameInfoParser currentGameInfoParser = new CurrentGameInfoParser();
		// CurrentGameInfo currentGameInfo = currentGameInfoParser.getJsonData(summonerid);
		// System.out.println("현재 게임 정보 : " + currentGameInfo.toString());
		
		if(summoner != null && !summoner.equals(null)) {
			return new ResponseEntity<Summoner>(summoner,HttpStatus.OK);
		}
		return new ResponseEntity<Summoner>(HttpStatus.NO_CONTENT);
	}
}
