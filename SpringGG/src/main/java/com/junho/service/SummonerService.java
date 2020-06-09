package com.junho.service;

import com.junho.dto.Summoner;

public interface SummonerService {

	Summoner findByName(String name);

	void insertSummoner(Summoner summoner);

}
