package com.minhthang.model;

import java.sql.Date;

public class Entity {

	private String id;
	private String name;
	private String description;
	private String link;
	private String date;

	public Entity(String id, String name, String description, String link, String date) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.link = link;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
