package Javacode;

public class A {
	private int balance=1000;


public int getBalance() {
	return balance;
}

public void setBalance(int balance, String username ,String password ,String otp) {
	
	if(username== "Pooja" && password== "123") {
		
		if(otp=="12345" ) {
		this.balance = balance+this.balance;
	}
	}
	else {
		System.out.println("Incorrect credential");
	}
}


}
