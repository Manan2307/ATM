package VMATM;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");

    HashMap<Integer , Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException{
        int x = 1;
        do {
            try {
                data.put(1234567, 8910);
                data.put(1234568 , 1011);

                System.out.println("Welcome to ATM");

                System.out.print("Enter your customer Number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.print("Enter your pin Number: ");
                setPinNumber(menuInput.nextInt());
            } catch(Exception e){
                System.out.println("\n" + "Invaild charater. Only Member" + "\n");
                x = 2;
            }
           for (Map.Entry < Integer, Integer> entry : data.entrySet()) 
           if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
            getAccountType();
           } else {
            System.out.println("\n" + " Wrong Customer Number or Pin Number" + " \n");
           }
    } while(x ==1);
}

int selection;
public void getAccountType() {
    System.out.println("what you want to access");
    System.out.println("Type 1 Current Account");
    System.out.println("Type 2 Saving Account");
    System.out.println("Type 3 Exit");
    System.out.println(" What You Would Like To Do: ");

    selection = menuInput.nextInt();
    
    switch(selection) {
    case 1 :
    getChecking();
    break;

    case 2 :
    getSaving();
    break;

    case 3:
    System.out.println("Thank you for using ATM");
    break;

    default :
    System.out.println("\n"+ "Invalid Choice" +"\n");
    getAccountType();
    }
}

public void getChecking(){
    System.out.println("Current Account: ");
    System.out.println("Type 1: View Balance");
    System.out.println("Type 2: Withdraw Fund");
    System.out.println("Type 3: Deposit Fund");
    System.out.println("Type 4: Exit");
    System.out.println(" What You Would Like To Do:");
    

    selection = menuInput.nextInt();
    switch(selection) {
    case 1 :
    System.out.println("Current Account Balance :" + moneyFormat.format(checkingBalance));
    getChecking();
    break;

    case 2 :
    getCheckingwithdrawInput();
    getChecking();
    break;

    case 3:
    getCheckingDepositInput();
    getChecking();
    break;

    case 4:
    System.out.println("Thank you for using ATM");
    break;

    default :
    System.out.println("\n"+ "Invalid Choice" +"\n");
    getAccountType();
    }
}

public void getSaving(){
    System.out.println("Saving Account: ");
    System.out.println("Type 1: View Balance");
    System.out.println("Type 2: Withdraw Fund");
    System.out.println("Type 3: Deposit Fund");
    System.out.println("Type4: Exit");
    System.out.println(" What You Would Like To Do: ");

    selection = menuInput.nextInt();
    switch(selection) {
    case 1 :
    System.out.println("Saving Account Balance :" + moneyFormat.format(savingBalance));
    getSaving();
    break;

    case 2 :
    getSavingWithdrawInput();
    getSaving();
    break;

    case 3:
    getSavingDepositInput();
    getSaving();
    break;

    case 4:
    System.out.println("Thank you for using ATM");
    break;

    default :
    System.out.println("\n"+ "Invalid Choice" +"\n");
    getAccountType();
    }
}
}