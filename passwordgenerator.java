package javabasicproject;
import java.util.Random;
public class passwordgenerator {
	private boolean hasoverlap(String s1,String s2) {
		for(char c: s1.toCharArray()) {
			if(s2.contains(String.valueOf(c))) {
				return true;
			}
		}return false;
	}
	String genpass(int length,boolean useLowercase,boolean useUppercase,boolean useNumbers,boolean useSpecialchars) {
		
		
		String lowercase="abcdefghijklmnopqrstuvwxyz";
		String uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String digits="0123456789";
		String symbols="!@#$%^&*";
		
		StringBuilder charoptions=new StringBuilder();
		if(useLowercase) {
			charoptions.append(lowercase);
		}
		if(useUppercase) {
			charoptions.append(uppercase);
		}
		if(useNumbers) {
			charoptions.append(digits);
		}
		if(useSpecialchars) {
			charoptions.append(symbols);
		}
		
		
		String allchars=charoptions.toString();
		
		StringBuilder password=new StringBuilder();
		Random rand=new Random();
		
		boolean passwordvalid=false;
		
		while(true){
			
		for(int i=0;i<length;i++) {
			char nextletter=allchars.charAt(rand.nextInt(allchars.length()));
			password.append(nextletter);
		}
		String pass= password.toString();
		
		passwordvalid=true;
		
		if(useLowercase && !hasoverlap(pass, lowercase)) {
			passwordvalid=false;
		}
		if(useUppercase && !hasoverlap(pass, uppercase)) {
			passwordvalid=false;
		}
		if(useNumbers && !hasoverlap(pass, digits)) {
			passwordvalid=false;
		}
		if(useSpecialchars && !hasoverlap(pass, symbols)) {
			passwordvalid=false;
		}
		if(passwordvalid) {
			return pass;
			
		}
		System.out.println("password is faile trying again..."+pass);
		}
	}

}
