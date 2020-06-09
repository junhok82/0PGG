package com.junho.dto;

import java.util.List;

public class ChampionLotation {
	private int maxNewPlayerLevel;
	private List<Integer> freeChampionIdsForNewPlayers;	
	private List<Integer> freeChampionIds;
	
	public ChampionLotation() {}
	public ChampionLotation(int maxNewPlayerLevel, List<Integer> freeChampionIdsForNewPlayers,
			List<Integer> freeChampionIds) {
		this.maxNewPlayerLevel = maxNewPlayerLevel;
		this.freeChampionIdsForNewPlayers = freeChampionIdsForNewPlayers;
		this.freeChampionIds = freeChampionIds;
	}
	public int getMaxNewPlayerLevel() {
		return maxNewPlayerLevel;
	}
	public void setMaxNewPlayerLevel(int maxNewPlayerLevel) {
		this.maxNewPlayerLevel = maxNewPlayerLevel;
	}
	public List<Integer> getFreeChampionIdsForNewPlayers() {
		return freeChampionIdsForNewPlayers;
	}
	public void setFreeChampionIdsForNewPlayers(List<Integer> freeChampionIdsForNewPlayers) {
		this.freeChampionIdsForNewPlayers = freeChampionIdsForNewPlayers;
	}
	public List<Integer> getFreeChampionIds() {
		return freeChampionIds;
	}
	public void setFreeChampionIds(List<Integer> freeChampionIds) {
		this.freeChampionIds = freeChampionIds;
	}
	@Override
	public String toString() {
		return "ChampionLotation [maxNewPlayerLevel=" + maxNewPlayerLevel + ", freeChampionIdsForNewPlayers="
				+ freeChampionIdsForNewPlayers + ", freeChampionIds=" + freeChampionIds + "]";
	}
	
}
