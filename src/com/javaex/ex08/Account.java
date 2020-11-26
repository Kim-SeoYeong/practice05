package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
    
    //필요한 메소드 작성
    //예금액 로직
    public int deposit(int money) {
    	int sum = this.balance += money;
    	return sum;
    }
    //출금액 로직
	public int withdraw(int money) {
		int minus = this.balance -= money;
		return minus;
	}
	//잔고액 로직
	public void showBalance() {
		System.out.println(this.balance);
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", balance=" + balance + "]";
	}
	
	
}
