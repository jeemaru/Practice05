package com.javaex.ex01;

public class Member {

	private String id;
	private String name;
	private int point;
	
	public void setId (String id) {
		this.id = id;
	}
	public void setName (String name) {
		this.name = name;
	}
	public void setPoint (int point) {
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPoint() {
		return point;
	}
	
	public void showinfo() {
		System.out.println(name+id+point);
	}
	
	
}
