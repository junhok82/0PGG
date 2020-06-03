package com.junho.dto;

public class Summoner {

	/** Summoner : 소환사 정보 **/
	// Encrypted account ID
	private String accountId;
	
	// ID of the summoner icon associated with the summoner.
	private int profileIconId;		
	
	// Date summoner was last modified specified as epoch milliseconds.
	// The following events will update this timestamp: 
	// profile icon change, playing the tutorial or advanced tutorial, finishing a game, summoner name change
	private long revisionDate;
	
	// Summoner name
	private String name;
	
	// Encrypted summoner ID
	private String id;
	
	// Encrypted PUUID
	private String puuid;
	
	// Summoner level associated with the summoner.
	private long summonerLevel;
		
	public Summoner() {}
	public Summoner(String accountId, int profileIconId, long revisionDate, String name, String id, String puuid,
			long summonerLevel) {
		this.accountId = accountId;
		this.profileIconId = profileIconId;
		this.revisionDate = revisionDate;
		this.name = name;
		this.id = id;
		this.puuid = puuid;
		this.summonerLevel = summonerLevel;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public int getProfileIconId() {
		return profileIconId;
	}
	public void setProfileIconId(int profileIconId) {
		this.profileIconId = profileIconId;
	}
	public long getRevisionDate() {
		return revisionDate;
	}
	public void setRevisionDate(long revisionDate) {
		this.revisionDate = revisionDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPuuid() {
		return puuid;
	}
	public void setPuuid(String puuid) {
		this.puuid = puuid;
	}
	public long getSummonerLevel() {
		return summonerLevel;
	}
	public void setSummonerLevel(long summonerLevel) {
		this.summonerLevel = summonerLevel;
	}

	
}
