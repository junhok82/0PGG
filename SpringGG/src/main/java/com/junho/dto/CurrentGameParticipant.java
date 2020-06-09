package com.junho.dto;

import java.util.ArrayList;
import java.util.List;

public class CurrentGameParticipant {
	// The ID of the champion played by this participant
	private long championId;
	
	// Perks/Runes Reforged Information
	private Perks perks;	
	
	// The ID of the profile icon used by this participant
	private long profileIconId;	
	
	// Flag indicating whether or not this participant is a bot
	private boolean bot;	 
	
	// The team ID of this participant, indicating the participant's team
	private long teamId;	
	
	// The summoner name of this participant
	private String summonerName;	
	
	// The encrypted summoner ID of this participant
	private String summonerId;
	
	// The ID of the first summoner spell used by this participant
	private long spell1Id;
	
	// The ID of the second summoner spell used by this participant
	private long spell2Id;	
	
	// List of Game Customizations
	private List<GameCustomizationObject> gameCustomizationObjects;

	public CurrentGameParticipant() {
		gameCustomizationObjects = new ArrayList<>();
	}

	public CurrentGameParticipant(long championId, Perks perks, long profileIconId, boolean bot, long teamId,
			String summonerName, String summonerId, long spell1Id, long spell2Id,
			List<GameCustomizationObject> gameCustomizationObjects) {
		gameCustomizationObjects = new ArrayList<>();
		this.championId = championId;
		this.perks = perks;
		this.profileIconId = profileIconId;
		this.bot = bot;
		this.teamId = teamId;
		this.summonerName = summonerName;
		this.summonerId = summonerId;
		this.spell1Id = spell1Id;
		this.spell2Id = spell2Id;
		this.gameCustomizationObjects = gameCustomizationObjects;
	}

	public long getChampionId() {
		return championId;
	}

	public void setChampionId(long championId) {
		this.championId = championId;
	}

	public Perks getPerks() {
		return perks;
	}

	public void setPerks(Perks perks) {
		this.perks = perks;
	}

	public long getProfileIconId() {
		return profileIconId;
	}

	public void setProfileIconId(long profileIconId) {
		this.profileIconId = profileIconId;
	}

	public boolean isBot() {
		return bot;
	}

	public void setBot(boolean bot) {
		this.bot = bot;
	}

	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}

	public String getSummonerName() {
		return summonerName;
	}

	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}

	public String getSummonerId() {
		return summonerId;
	}

	public void setSummonerId(String summonerId) {
		this.summonerId = summonerId;
	}

	public long getSpell1Id() {
		return spell1Id;
	}

	public void setSpell1Id(long spell1Id) {
		this.spell1Id = spell1Id;
	}

	public long getSpell2Id() {
		return spell2Id;
	}

	public void setSpell2Id(long spell2Id) {
		this.spell2Id = spell2Id;
	}

	public List<GameCustomizationObject> getGameCustomizationObjects() {
		return gameCustomizationObjects;
	}

	public void setGameCustomizationObjects(List<GameCustomizationObject> gameCustomizationObjects) {
		this.gameCustomizationObjects = gameCustomizationObjects;
	}
	@Override
	public String toString() {
		return "CurrentGameParticipant [championId=" + championId + ", perks=" + perks + ", profileIconId="
				+ profileIconId + ", bot=" + bot + ", teamId=" + teamId + ", summonerName=" + summonerName
				+ ", summonerId=" + summonerId + ", spell1Id=" + spell1Id + ", spell2Id=" + spell2Id
				+ ", gameCustomizationObjects=" + gameCustomizationObjects + "]";
	}
	
}
