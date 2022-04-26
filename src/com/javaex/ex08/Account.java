package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    
    public Account(String accountNo) {
		this.accountNo = accountNo;
	}
      

	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
    
    //생성자 작성
    
    
    
    //필요한 메소드 작성
    public int deposit(int deposit) {
    	return deposit;
    }
    
    public int withdraw(int withdraw) {
    	return withdraw;
    }
    
    public void showBalance() {
    	System.out.print(balance);
    }
    
}
