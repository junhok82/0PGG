package com.junho.dto;

public class BannedChampion {

	// The turn during which the champion was banned
	private int pickTurn;
	
	// The ID of the banned champion
	private long championId;
	
	// The ID of the team that banned the champion
	private long teamId;

	public BannedChampion() {}
	public BannedChampion(int pickTurn, long championId, long teamId) {
		this.pickTurn = pickTurn;
		this.championId = championId;
		this.teamId = teamId;
	}
	public int getPickTurn() {
		return pickTurn;
	}
	public void setPickTurn(int pickTurn) {
		this.pickTurn = pickTurn;
	}
	public long getChampionId() {
		return championId;
	}
	public void setChampionId(long championId) {
		this.championId = championId;
	}
	public long getTeamId() {
		return teamId;
	}
	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}
	@Override
	public String toString() {
		return "BannedChampion [pickTurn=" + pickTurn + ", championId=" + championId + ", teamId=" + teamId + "]";
	}
	
	
}
