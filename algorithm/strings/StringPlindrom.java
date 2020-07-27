package com.informatica.alog.sdet;

public class StringPlindrom {
	
	public static void main(String [] args){
		String str = "madam";
		System.out.println(isPlindrom(str));
		
	}
	
	public static boolean isPlindrom(String str){
		if(str == null){
			return false;
		}
		int len = str.length()-1/2;
		for (int i = 0, j = str.length()-1; i<j ; i++, j--) {
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
		}
		return true;
	}

}
