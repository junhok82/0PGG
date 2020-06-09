package com.junho.dto;

import java.util.ArrayList;
import java.util.List;

public class Perks {

	// IDs of the perks/runes assigned.
	private List<Long> perkIds;	
	
	// Primary runes path
	private long perkStyle;
	
	// Secondary runes path
	private long perkSubStyle;

	public Perks() {
		perkIds = new ArrayList<>();
	}
	public Perks(List<Long> perkIds, long perkStyle, long perkSubStyle) {
		perkIds = new ArrayList<>();
		this.perkIds = perkIds;
		this.perkStyle = perkStyle;
		this.perkSubStyle = perkSubStyle;
	}

	public List<Long> getPerkIds() {
		return perkIds;
	}

	public void setPerkIds(List<Long> perkIds) {
		this.perkIds = perkIds;
	}

	public long getPerkStyle() {
		return perkStyle;
	}

	public void setPerkStyle(long perkStyle) {
		this.perkStyle = perkStyle;
	}

	public long getPerkSubStyle() {
		return perkSubStyle;
	}

	public void setPerkSubStyle(long perkSubStyle) {
		this.perkSubStyle = perkSubStyle;
	}
	@Override
	public String toString() {
		return "Perks [perkIds=" + perkIds + ", perkStyle=" + perkStyle + ", perkSubStyle=" + perkSubStyle + "]";
	}
	
	
}
