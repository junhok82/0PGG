package com.junho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junho.dao.SummonerDao;
import com.junho.dto.Summoner;

@Service
public class SummonerServiceImpl implements SummonerService{

	@Autowired
	private SummonerDao dao;
	
	@Override
	public Summoner findByName(String name) {
		return dao.findByName(name);
	}

	@Override
	public void insertSummoner(Summoner summoner) {
		dao.insertSummoner(summoner);
	}
	
}
