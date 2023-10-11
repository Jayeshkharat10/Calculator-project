package com.Atm;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		int withdraw,balance = 55000;
		System.out.println("Welcome to Jayesh ATM Machine");
		System.out.println();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your PIN");//pin
		int PIN = sc.nextInt();
		if(PIN == 143) {
			System.out.println("PIN is corrent");		
		}else {
			System.out.println("Incurrent PIN plz Try Again.....");
			System.exit(0);
		}
		int n=4;
		for (int i = 1; i<=n; i++) {
			System.out.println("           ");
			System.out.println("     1.cash withdraw  2.cash Deposit");
			System.out.println("           ");
			System.out.println("            ");
			System.out.println("      3.Mini Statement  4.Balance Inquiry");
			System.out.println("           ");
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter amount for withdraw ");//withdraw
				withdraw = sc.nextInt();
				if(balance >= withdraw) {
					balance = balance-withdraw;
					System.out.println("Collect your cash ="+withdraw);
				}else {
					System.out.println("Insufficent Balance");
				}
				break;
			case 2:
				System.out.println("Enter Amount for deposite");//Deposit
				int Deposit = sc.nextInt();
				balance = balance + Deposit;
				System.out.println(Deposit + "  is deposit to your account");
				break;
			case 3:System.out.println("    Mini Statement");//MiniStatment
			    System.out.println("Name = ALICE____XXXXX");
			    System.out.println("Mobile no = XXXXXXXXXX");
		    	System.out.println("Email = XXXXXXX@gmail.com");
			    System.out.println("Balance "+balance);
			case 4:
				System.out.println("Total balance"+balance);//balance
			}
		}
		        System.out.println("      ");
		        System.out.println("*************  Thank you *************");
		        System.out.println("     Visit again");
		 
	}

}

