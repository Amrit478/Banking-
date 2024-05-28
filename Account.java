public abstract class Account {

private int Balance;
private int Expense;
private int Deposit;

Public Account(int balance, int expense, int deposit) {
this.Balance = balance;
this.Expense = expense;
this.Deposit = deposit;
}

//Getters 

public abstract double getbalance();

public abstract double getexpense();

public abstract double getdeposit();