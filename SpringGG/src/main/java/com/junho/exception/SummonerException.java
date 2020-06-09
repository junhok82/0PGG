package com.junho.exception;

public class SummonerException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public SummonerException() {}
	public SummonerException(String msg) {
		super(msg);
	}
}
