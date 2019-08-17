package org.blockcerts.java.model;

public class Issuer {

	private String id;
	private String type;
	private String name;
	private String image;
	private String url;
	private String email;
	private String revocationList;
	private String description;
	
	
	
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getRevocationList() {
		return revocationList;
	}
	public void setRevocationList(String revocationList) {
		this.revocationList = revocationList;
	}
	@Override
	public String toString() {
		return "Issuer [id=" + id + ", type=" + type + ", name=" + name + ", image=" + image + ", url=" + url
				+ ", email=" + email + "]";
	}
}