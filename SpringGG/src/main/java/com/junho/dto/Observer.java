package com.junho.dto;

public class Observer {
	// 	Key used to decrypt the spectator grid game data for playback
	private String encryptionKey;

	public Observer() {}
	public Observer(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	public String getEncryptionKey() {
		return encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	@Override
	public String toString() {
		return "Observer [encryptionKey=" + encryptionKey + "]";
	}
	
	
}
