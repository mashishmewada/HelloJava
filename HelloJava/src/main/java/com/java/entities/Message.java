package com.java.entities;

public class Message {
	
	private String contect;
	private String type;
	private String cssClass;
	
	public Message(String contect, String type, String cssClass) {
		super();
		this.contect = contect;
		this.type = type;
		this.cssClass = cssClass;
	}
	
	public Message() {
		super();
	}

	public String getContect() {
		return contect;
	}

	public void setContect(String contect) {
		this.contect = contect;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCssClass() {
		return cssClass;
	}

	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}
	
	 

}
