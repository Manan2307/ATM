package VMATM;

import java.text.DecimalFormat;
import java.util.*;

public class Account{
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");

    private int customerNumber;
    private int pinNumber;
    public int checkingBalance = 0;
    public int savingBalance = 0;


    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getCustomerNumber(){
        return customerNumber;
    }

    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public int getPinNumber(){
        return pinNumber;
    }

    public int getCheckingBalance(){
        return checkingBalance;
    }

    public int getSavingBalance(){
        return savingBalance;
    }

    public int calcCheckingwithdraw(int amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public int calcSavingwithdraw(int amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    public int calcCheckingDeposit(int amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    public int calcSavingDeposit(int amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    public void getCheckingwithdrawInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("The Amount You Want to Withdraw from the Checking Account");
        int amount = input.nextInt();

        if((checkingBalance - amount) >= 0) {
            calcCheckingwithdraw(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }else {
            System.out.println("Balance cannot be Negative." + "\n");
        }
    }

    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("The Amount You Want to Withdraw from the Saving Account");
        int amount = input.nextInt();

        if((savingBalance - amount) >= 0) {
            calcSavingwithdraw(amount);
            System.out.println("New Saving Account Balance: " + savingBalance + "\n");
        }else {
            System.out.println("Balance cannot be Negative." + "\n");
        }
    }

    public void getCheckingDepositInput() {
		System.out.println("Checking Account balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to deposit into Checking Account: ");
		int amount = input.nextInt();
		if ((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Balance cannot be negetive");
		}
	}

    public void getSavingDepositInput() {
		System.out.println("Saving Account balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to deposit into Saving Account: ");
		int amount = input.nextInt();
		if ((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance cannot be negetive");
		}
	}
}