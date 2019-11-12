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
public class SavingAccount {

    private String account_id;
    private String user_id;
    private String account_name;
    private float balance;

    public SavingAccount(String account_id, String user_id, String account_name, float balance) {
        this.account_id = account_id;
        this.user_id = user_id;
        this.account_name = account_name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "SavingAccount{" + "account_id=" + account_id + ", user_id=" + user_id + ", account_name=" + account_name + ", balance=" + balance + '}';
    }

}
