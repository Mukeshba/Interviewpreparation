package org.bank;

public class BankInfo {
	private void saving() {
System.out.println("My saving in Indian is 150000rs");
	}
	
	private void fixed(int f) {
System.out.println("In that Fixed amount is "+f+"rs");
	}
	
	public void deposit(int f, String S) {
		System.out.println("deposited amount on "+f+" is "+S+"rs");

	}
	public static void main(String[] args) {
		BankInfo B = new BankInfo();
		B.saving();
		B.fixed(500000);
		B.deposit(2019, "100000");
	}
}
