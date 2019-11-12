/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepatternbadcode.vietinbank;

/**
 *
 * @author nguyennh
 */
public class CheckingAccount {

    private String account_id;
    private String user_id;
    private String account_name;
    private float balance;

    public CheckingAccount(String account_id, String user_id, String account_name, float balance) {
        this.account_id = account_id;
        this.user_id = user_id;
        this.account_name = account_name;
        this.balance = balance;
    }

    public String getAccount_id() {
        return account_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public float getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + "account_id=" + account_id + ", user_id=" + user_id + ", account_name=" + account_name + ", balance=" + balance + '}';
    }
    
    

}
