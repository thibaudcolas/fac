package com.example.project;

public class Image {
	private int path;
	private String name_en;
	private String name_fr;
	
	public Image(int p, String en, String fr)
	{
		path =p;
		name_en=en;
		name_fr=fr;
	}
	public Image()
	{
		path = 0;
		name_en=null;
		name_fr=null;
	}

	public int getPath() {
		return path;
	}

	public void setPath(int s) {
		this.path = s;
	}

	public String getName_en() {
		return name_en;
	}

	public void setName_en(String name_en) {
		this.name_en = name_en;
	}

	public String getName_fr() {
		return name_fr;
	}

	public void setName_fr(String name_fr) {
		this.name_fr = name_fr;
	}

}
