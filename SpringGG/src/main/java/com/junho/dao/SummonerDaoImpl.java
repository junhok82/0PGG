package com.junho.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.junho.dto.Summoner;
import com.junho.mapper.SummonerMapper;

@Repository
public class SummonerDaoImpl implements SummonerDao{

	@Autowired
	private SummonerMapper summonerMapper;
	
	@Override
	public Summoner findByName(String name) {
		return summonerMapper.findByName(name);
	}

	@Override
	public void insertSummoner(Summoner summoner) {
		summonerMapper.insertSummoner(summoner);
	}

}
