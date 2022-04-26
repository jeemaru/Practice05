package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("친구를 3명 등록해 주세요");
        Friend[] friendArray = new Friend[3];
        
        for (int i = 0; i < friendArray.length; i++) {
			Friend name = new Friend();
			//Friend hp = new Friend();
			//Friend school = new Friend();
			System.out.print("이름: ");
			name.setName(sc.nextLine());

			System.out.print("핸드폰: ");
			name.setHp(sc.nextLine());

			System.out.print("학교: ");
			name.setSchool(sc.nextLine());

			System.out.println("===============: ");
			//출력 하고 에러가 왜뜨는지 모르겠다..
		}
       

        
       
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
