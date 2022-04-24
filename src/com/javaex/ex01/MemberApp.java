package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member 정우성 = new Member();
		정우성.setName("정우성");
		정우성.setId("jus");
		정우성.setPoint(50000);
		
		Member 유재석 = new Member();
		유재석.setName("유재석");
		유재석.setId("yjs");
		유재석.setPoint(30000);
		
		Member 이효리 = new Member();
		이효리.setName("이효리");
		이효리.setId("lhr");
		이효리.setPoint(40000);
		
		정우성.showinfo();
		유재석.showinfo();
		이효리.showinfo();
	}
}
