package com.junho.dto;

public class GameCustomizationObject {

	// Category identifier for Game Customization
	private String category;
	
	// category	string	
	private String content;
	
	public GameCustomizationObject() {}
	public GameCustomizationObject(String category, String content) {
		this.category = category;
		this.content = content;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "GameCustomizationObject [category=" + category + ", content=" + content + "]";
	}
	
}
