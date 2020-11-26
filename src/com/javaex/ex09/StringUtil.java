package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
    	
        //메소드 내용작성
    	String result = "";	//결과값 초기화
    	
        for(int i=0; i < strArray.length; i++) {
        	
        	result += strArray[i];
        	
        }
        
        return result;
    }
}
