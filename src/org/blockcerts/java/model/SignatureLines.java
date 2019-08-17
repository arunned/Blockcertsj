package org.blockcerts.java.model;

import java.util.List;

public class SignatureLines {
	
	private String image;
	private String jobTitle;
	private List<Object> type;
	private String name;
	
	
	
	
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
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public List<Object> getType() {
		return type;
	}
	public void setType(List<Object> type) {
		this.type = type;
	}
	
	

}
