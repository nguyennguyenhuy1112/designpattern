/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguyennh
 */
public abstract class Bank {

    protected List<Account> accounts = new ArrayList<>();

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }

    public abstract void openAccount(Account account);

    public void showAccount() {
        System.out.println("Account information:");
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
    }

}
