package org.blockcerts.java.model;

import java.util.List;

public class Verification {

private List<String> type; //"identityClaim","Extension"
private String publicKey;



public String getPublicKey() {
	return publicKey;
}

public void setPublicKey(String publicKey) {
	this.publicKey = publicKey;
}

public List<String> getType() {
	return type;
}

public void setType(List<String> type) {
	this.type = type;
}

@Override
public String toString() {
	return "Verification [type=" + type + "]";
}
	
	
}