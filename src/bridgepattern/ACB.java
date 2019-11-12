/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepattern;

import java.util.List;

/**
 *
 * @author nguyennh
 */
public class ACB extends Bank{

    public ACB(List<Account> accounts) {
        super(accounts);
    }

    @Override
    public void openAccount(Account account) {
        this.accounts.add(account);
        account.openAccount();
    }
    
}
