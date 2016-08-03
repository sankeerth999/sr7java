package com.practice.chapter4;

public class Oracle implements Database {

	static{
		System.out.println("Oracle DB Initiated");
	}
	
	@Override
	public void getConnection() {
		clearCache();
		System.out.println("Got the connection from Oracle DB");
	}

	private void clearCache(){
		System.out.println("Cache Cleared");
	}
	
	public void createStatement() {
		System.out.println("Created Oracle Statement");
	}

	public void executeQuery() {
		System.out.println("SQL Executed");
	}

	public void shutDown() {
		System.out.println("Oracle Shutdown Completed");
	}
	
	public void execute(){
		getConnection();
		createStatement();
		executeQuery();
		shutDown();
	}

}
