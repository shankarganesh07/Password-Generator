package javabasicproject;

public class app2 {
	public static void main(String[] args) {
		userinterface ui=new textbasedinterface();
		
		int length =ui.getPasswordLength();
		boolean uselowercase=ui.useLowercase();
		boolean useuppercase=ui.useUppercase();
		boolean usenumbers=ui.useNumbers();
		boolean usesymbols=ui.useSymbols();
		
		passwordgenerator gen=new passwordgenerator();
		
		String password =gen.genpass(length, uselowercase, useuppercase, usenumbers, usesymbols);
		ui.displaypassword(password);
	}

}
