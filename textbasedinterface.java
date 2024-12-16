package javabasicproject;
import java.util.Scanner;

public class textbasedinterface implements userinterface {
          private Scanner scanner;
          
	public textbasedinterface() {
		this.scanner=new Scanner(System.in);
	}
	
	@Override
	public int getPasswordLength() {
		System.out.print("please enter the pass length");
		return scanner.nextInt();
	}

	@Override
	public boolean useLowercase() {
		System.out.print("would you like to have lowercase pass? (y/n)");
		return scanner.next().equalsIgnoreCase("y");
	}

	@Override
	public boolean useUppercase() {
		System.out.print("would you like to have uppercase pass? (y/n)");
		return scanner.next().equalsIgnoreCase("y");
	}

	@Override
	public boolean useNumbers() {
		System.out.print("would you like to have usenumbers pass? (y/n)");
		return scanner.next().equalsIgnoreCase("y");
	}

	@Override
	public boolean useSymbols() {
		System.out.print("would you like to have usesymbols pass? (y/n)");
		return scanner.next().equalsIgnoreCase("y");
	}

	@Override
	public void displaypassword(String password) {
		System.out.println("Here is the password: "+password);
		
	}

}
