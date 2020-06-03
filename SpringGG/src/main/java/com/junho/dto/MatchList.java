package com.junho.dto;

import java.util.List;

public class MatchList {
	private int startIndex;	
	private int totalGames;	
	private int endIndex;	
	private List<MatchReference> matches;
	
	public MatchList() {}
	public MatchList(int startIndex, int totalGames, int endIndex, List<MatchReference> matches) {
		this.startIndex = startIndex;
		this.totalGames = totalGames;
		this.endIndex = endIndex;
		this.matches = matches;
	}


	public int getStartIndex() {
		return startIndex;
	}


	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}


	public int getTotalGames() {
		return totalGames;
	}


	public void setTotalGames(int totalGames) {
		this.totalGames = totalGames;
	}


	public int getEndIndex() {
		return endIndex;
	}


	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}


	public List<MatchReference> getMatches() {
		return matches;
	}


	public void setMatches(List<MatchReference> matches) {
		this.matches = matches;
	}


	@Override
	public String toString() {
		return "MatchList [startIndex=" + startIndex + ", totalGames=" + totalGames + ", endIndex=" + endIndex
				+ ", matches=" + matches + "]";
	}
	
	
}
