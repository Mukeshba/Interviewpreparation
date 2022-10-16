package org.bank;

public class AxisBank extends BankInfo {
	
	
	private void deposit(int i) {
		System.out.println("Amount deposited on Axis bank is " + i);
	}

	@Override
	public void deposit(int f, String S) {
System.out.println("Deposited amount on 2020 is "+f+S);
	}
	
	public static void main(String[] args) {
		AxisBank A = new AxisBank();
		A.deposit(200000);
		A.deposit(300000, " In that 100000rs is to start a new business after 2022");
	}
	
	private void Mukesh() {
	System.out.println("10LPA");

	}
	

}
