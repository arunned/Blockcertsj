package org.blockcerts.java.model;



/**
 * 
 * @Title: Anchors.java
 * @Package org.bham.btcert.model.certificate
 * @Description: TODO
 * @author rxl635@student.bham.ac.uk
 * @version V1.0
 */
public class Anchors {
	
	
	private String chain;
	private String type;
	private String sourceId;

	

	public String getChain() {
		return chain;
	}

	public void setChain(String chain) {
		this.chain = chain;
	}



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	@Override
	public String toString() {
		return "Anchors [type=" + type + ", sourceId=" + sourceId + "]";
	}

}
