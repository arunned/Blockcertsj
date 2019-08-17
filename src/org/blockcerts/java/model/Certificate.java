package org.blockcerts.java.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Certificate {
	
	@SerializedName("@context")
	private List<Object> context;
	private String type;
	private String issuedOn;
	private String id;
	private Recipient recipient;
	private RecipientProfile recipientProfile;
	private Badge badge;
	private Verification verification;
	private Signature signature;
	
	private String nonce;
	private String metadataJson;
	private String displayHtml;
	private String universalIdentifier;
	
	public List<Object> getContext() {
		return context;
	}
	public void setContext(List<Object> context) {
		this.context = context;
	}
	public String getNonce() {
		return nonce;
	}
	public void setNonce(String nonce) {
		this.nonce = nonce;
	}
	public String getMetadataJson() {
		return metadataJson;
	}
	public void setMetadataJson(String metadataJson) {
		this.metadataJson = metadataJson;
	}
	public String getDisplayHtml() {
		return displayHtml;
	}
	public void setDisplayHtml(String displayHtml) {
		this.displayHtml = displayHtml;
	}
	public String getUniversalIdentifier() {
		return universalIdentifier;
	}
	public void setUniversalIdentifier(String universalIdentifier) {
		this.universalIdentifier = universalIdentifier;
	}
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getIssuedOn() {
		return issuedOn;
	}
	public void setIssuedOn(String issuedOn) {
		this.issuedOn = issuedOn;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Recipient getRecipient() {
		return recipient;
	}
	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}
	public RecipientProfile getRecipientProfile() {
		return recipientProfile;
	}
	public void setRecipientProfile(RecipientProfile recipientProfile) {
		this.recipientProfile = recipientProfile;
	}
	public Badge getBadge() {
		return badge;
	}
	public void setBadge(Badge badge) {
		this.badge = badge;
	}
	public Verification getVerification() {
		return verification;
	}
	public void setVerification(Verification verification) {
		this.verification = verification;
	}
	public Signature getSignature() {
		return signature;
	}
	public void setSignature(Signature signature) {
		this.signature = signature;
	}
	

}
