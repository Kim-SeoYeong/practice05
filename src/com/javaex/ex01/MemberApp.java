package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		Member[] memberArray = new Member[3];
		
		Member member01 = new Member("jws", "정우성", 50000);
		Member member02 = new Member("yjs", "유재석", 30000);
		Member member03 = new Member("lhr", "이효리", 40000);
		
		memberArray[0] = member01;
		memberArray[1] = member02;
		memberArray[2] = member03;
		
		for(int i = 0; i < memberArray.length; i++) {
			memberArray[i].showInfo();
		}

		
	}

}
