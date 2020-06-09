package com.junho.dao;

import com.junho.dto.Summoner;

public interface SummonerDao {

	Summoner findByName(String name);

	void insertSummoner(Summoner summoner);
}
