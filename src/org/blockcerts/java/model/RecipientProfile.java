package org.blockcerts.java.model;

import java.util.List;

public class RecipientProfile {
	private List<String> type;
	private String name;
	private String publicKey;
	public List<String> getType() {
		return type;
	}
	public void setType(List<String> type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	
	
	

}
