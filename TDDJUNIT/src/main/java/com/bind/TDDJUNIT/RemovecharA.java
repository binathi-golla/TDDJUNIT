package com.bind.TDDJUNIT;

public class RemovecharA {

	public String Remove(String string) {
		String result="";
		string=string.toUpperCase();
		if(string.charAt(0)=='A' && string.charAt(1)=='A') {
			result=result+string.substring(2);	
		}
		else if(string.charAt(0)=='A') {
			result=result+string.substring(1);
			
		}
		else if(string.charAt(1)=='A') {
			result=result+string.substring(0,1)+string.substring(2);
			
		}
		else {
			result=result+string;	
		}
		
		return result;	
	}

}
