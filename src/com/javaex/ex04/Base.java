package com.javaex.ex04;

public class Base {

	
        //코드작성할것
	

	public void service(String a) {
		if(a=="낮"){
			System.out.println("낮에는 열심히 수업듣자");
		}else if(a=="밤") {
			System.out.println("밤에는 숙면");
		}else if (a=="오후"){
			System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
		}
	}

	

    public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
    	System.out.println("밤에는 숙면");
    	//코드작성할것
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
}

