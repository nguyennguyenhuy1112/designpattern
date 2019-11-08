/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepattern;

/**
 *
 * @author nguyennh
 */
public abstract class Bank {

    protected Account account;
//    protected List<Account> accounts = new ArrayList<>

    public Bank(Account account) {
        this.account = account;
    }

    public abstract void openAccount();
}
