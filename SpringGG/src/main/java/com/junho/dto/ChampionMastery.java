package com.junho.dto;

public class ChampionMastery {

	/** ChampionMastery : 숙련 **/
	// Number of points needed to achieve next level. Zero if player reached maximum champion level for this champion.
	private long championPointsUntilNextLevel;
	
	// Is chest granted for this champion or not in current season.
	private boolean chestGranted;
	
	// Champion ID for this entry.
	private long championId;
	
	// Last time this champion was played by this player - in Unix milliseconds time format.
	private long lastPlayTime;
	
	// 	Champion level for specified player and champion combination.
	private int championLevel;
	
	//Summoner ID for this entry. (Encrypted)
	private String summonerId;
	
	// Total number of champion points for this player and champion combination - they are used to determine championLevel.
	private int championPoints;
	
	// Number of points earned since current level has been achieved.
	private long championPointsSinceLastLevel;	
	
	// The token earned for this champion to levelup.
	private int tokensEarned;

	public ChampionMastery() {}
	public ChampionMastery(long championPointsUntilNextLevel, boolean chestGranted, long championId, long lastPlayTime,
			int championLevel, String summonerId, int championPoints, long championPointsSinceLastLevel,
			int tokensEarned) {
		this.championPointsUntilNextLevel = championPointsUntilNextLevel;
		this.chestGranted = chestGranted;
		this.championId = championId;
		this.lastPlayTime = lastPlayTime;
		this.championLevel = championLevel;
		this.summonerId = summonerId;
		this.championPoints = championPoints;
		this.championPointsSinceLastLevel = championPointsSinceLastLevel;
		this.tokensEarned = tokensEarned;
	}
	public long getChampionPointsUntilNextLevel() {
		return championPointsUntilNextLevel;
	}
	public void setChampionPointsUntilNextLevel(long championPointsUntilNextLevel) {
		this.championPointsUntilNextLevel = championPointsUntilNextLevel;
	}
	public boolean isChestGranted() {
		return chestGranted;
	}
	public void setChestGranted(boolean chestGranted) {
		this.chestGranted = chestGranted;
	}
	public long getChampionId() {
		return championId;
	}
	public void setChampionId(long championId) {
		this.championId = championId;
	}
	public long getLastPlayTime() {
		return lastPlayTime;
	}
	public void setLastPlayTime(long lastPlayTime) {
		this.lastPlayTime = lastPlayTime;
	}
	public int getChampionLevel() {
		return championLevel;
	}
	public void setChampionLevel(int championLevel) {
		this.championLevel = championLevel;
	}
	public String getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(String summonerId) {
		this.summonerId = summonerId;
	}
	public int getChampionPoints() {
		return championPoints;
	}
	public void setChampionPoints(int championPoints) {
		this.championPoints = championPoints;
	}
	public long getChampionPointsSinceLastLevel() {
		return championPointsSinceLastLevel;
	}
	public void setChampionPointsSinceLastLevel(long championPointsSinceLastLevel) {
		this.championPointsSinceLastLevel = championPointsSinceLastLevel;
	}
	public int getTokensEarned() {
		return tokensEarned;
	}
	public void setTokensEarned(int tokensEarned) {
		this.tokensEarned = tokensEarned;
	}
	
	@Override
	public String toString() {
		return "ChampionMastery [championPointsUntilNextLevel=" + championPointsUntilNextLevel + ", chestGranted="
				+ chestGranted + ", championId=" + championId + ", lastPlayTime=" + lastPlayTime + ", championLevel="
				+ championLevel + ", summonerId=" + summonerId + ", championPoints=" + championPoints
				+ ", championPointsSinceLastLevel=" + championPointsSinceLastLevel + ", tokensEarned=" + tokensEarned
				+ "]";
	}
	
}
