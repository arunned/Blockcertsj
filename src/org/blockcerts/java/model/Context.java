package org.blockcerts.java.model;

import java.util.List;

public class Context {
	
	private List<String> strings;
	private MetadataJson metadataJson;
	private DisplayHtml displayHtml;
	private Nonce nonce;
	private UniversalIdentifier universalIdentifier;
	
	
	public List<String> getStrings() {
		return strings;
	}
	public void setStrings(List<String> strings) {
		this.strings = strings;
	}
	public MetadataJson getMetadataJson() {
		return metadataJson;
	}
	public void setMetadataJson(MetadataJson metadataJson) {
		this.metadataJson = metadataJson;
	}
	public DisplayHtml getDisplayHtml() {
		return displayHtml;
	}
	public void setDisplayHtml(DisplayHtml displayHtml) {
		this.displayHtml = displayHtml;
	}
	public Nonce getNonce() {
		return nonce;
	}
	public void setNonce(Nonce nonce) {
		this.nonce = nonce;
	}
	public UniversalIdentifier getUniversalIdentifier() {
		return universalIdentifier;
	}
	public void setUniversalIdentifier(UniversalIdentifier universalIdentifier) {
		this.universalIdentifier = universalIdentifier;
	}
	
	
	
	

}
