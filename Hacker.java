package day05;


class A{ //fault == package private 같은 package 내에서만 접근이 가능함. 
	
}

public class Hacker {
	public static void main(String ar[]){
		BankAccount account =new BankAccount();
		account.password="1234";
		account.owner="me";
		
		
		System.out.println(account.password);
		System.out.println(account.amount);
		System.out.println(account.owner);
		
	}
}
