package com.bean;

public class Pic {

	private String path;
	private String imgname;
	
	public Pic()
	{}

	public Pic(String path, String imgname) {
		super();
		this.path = path;
		this.imgname = imgname;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getImgname() {
		return imgname;
	}

	public void setImgname(String imgname) {
		this.imgname = imgname;
	}

	@Override
	public String toString() {
		return "Pic [path=" + path + ", imgname=" + imgname + "]";
	}

	
	
}
