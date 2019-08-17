package org.blockcerts.java.model;

public class Recipient {

	private Boolean hashed;
	private String identity;
	private String type;
	
	
	public Boolean getHashed() {
		return hashed;
	}
	public void setHashed(Boolean hashed) {
		this.hashed = hashed;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Recipient [hashed=" + hashed + ", identity=" + identity + ", type=" + type + "]";
	}
}
