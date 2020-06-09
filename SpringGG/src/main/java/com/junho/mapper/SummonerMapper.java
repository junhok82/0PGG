package com.junho.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.junho.dto.Summoner;

@Mapper
public interface SummonerMapper {

	Summoner findByName(String name);

	void insertSummoner(Summoner summoner);
}
