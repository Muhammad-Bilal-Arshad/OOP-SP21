/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;

/**
 *
 * @author B1LITE
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

 public class Account implements Serializable {
	private String name;
	private int accountNum; 
        private double bankBalance = 25000.000;

        
        
	Scanner user_input = new Scanner(System.in);

	public Account(String name, int accountNum) {
		super();
		this.name = name;
		this.accountNum = accountNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [ name: " + name + " accountNum: " + accountNum + " bankBalance: " + bankBalance + "]\n";
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public int getBankBalance() {
		return (int) bankBalance;
	}

	public void setBankBalance(int bankBalance) {
		this.bankBalance += bankBalance;
	}

	public void WithDraw() {

		System.out.println("Enter the amount you want to withdraw: ");
		int cash = user_input.nextInt();
		bankBalance -= cash;
		System.out.println("Cash Withdrawn \nRemaining balance: " + bankBalance);

	}

	public void deposit() {

		System.out.println("Enter the amount you want to deposit: ");
		int cash = user_input.nextInt();
		bankBalance += cash;
		System.out.println("Cash Deposited \nRemaining balance: " + bankBalance);

	}

	public void balanceInquiry() {
		int balance = getBankBalance();
		System.out.println("Your current balance is: " + balance);
	}

	public void transfer(Account to, Account from) {

		System.out.println("Enter the amount you want to transfer: ");
		int cash = user_input.nextInt();
		to.setBankBalance((int) (bankBalance + cash));
		from.setBankBalance((int) (bankBalance - cash));
		System.out.println(cash + " Amount succussfully Transfered ");

	}
        
        

	public static void writeFile(ArrayList<Account> record) {
		FileOutputStream bookStream;
		try {

			bookStream = new FileOutputStream("E:\\Account.txt");
			ObjectOutputStream objectStream = new ObjectOutputStream(bookStream);
			objectStream.writeObject(record.toString());
			objectStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
        

	public static void readFile(ArrayList<Account> record) {

		try {
			FileInputStream inputStream = new FileInputStream("E:\\Account.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			System.out.println(objectInputStream.readObject());

			objectInputStream.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
