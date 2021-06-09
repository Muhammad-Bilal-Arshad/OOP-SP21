/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;
import java.util.ArrayList;

/**
 *
 * @author B1LITE
 */
public class Runner {
    public static void main(String[] args) {
        Account u1 = new Account("Hassan", 99);
        Account u2 = new Account("Sehr", 89);
        Account u3 = new Account("TAlha", 79);
	Account u4 = new Account("Ubaid", 69);
	Account u5 = new Account("Shahid", 59);
	Account u6 = new Account("Ayesha", 49);
	Account u7 = new Account("Nimra", 39);
	Account u8 = new Account("Sohaib", 29);
	Account u9 = new Account("Amir", 19);
	Account u10 = new Account("Junaid", 9);

		
	ArrayList<Account> user_account = new ArrayList<Account>();
	user_account.add(u1);
	user_account.add(u2);
	user_account.add(u3);
	user_account.add(u4);
	user_account.add(u5);
	user_account.add(u6);
	user_account.add(u7);
	user_account.add(u8);
	user_account.add(u9);
	user_account.add(u10);
        
        
//Writing ten objects of Account in a file
	Account.writeFile(user_account);
        
        
//e functions for withdraw, deposit, transfer and balance inquiry. 
	u8.deposit();
	u6.balanceInquiry();
	u10.WithDraw();
	u1.transfer(u2, u3);
		
        
    }
}
