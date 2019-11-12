/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepatternbadcode.acb;

import bridgepatternbadcode.Bank;

/**
 *
 * @author nguyennh
 */
public class ACB extends Bank {

    public ACB(String user_id, String bank_username) {
        super(user_id, bank_username);
    }

    public SavingAccount createSavingAccount(String account_id, String account_name, float balance) {
        SavingAccount savingAccount = new SavingAccount(account_id, this.getUser_id(), account_name, balance);
        System.out.println(account_name + " created successfully");
        return savingAccount;
    }

    public CheckingAccount createCheckingAccount(String account_id, String account_name, float balance) {
        CheckingAccount checkingAccount = new CheckingAccount(account_id, this.getUser_id(), account_name, balance);
        System.out.println(account_name + " created successfully");
        return checkingAccount;
    }

}
