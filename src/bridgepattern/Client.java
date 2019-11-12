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
public class Client {

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new CheckingAccount("Nguyen Huy Nguyen", 9000000));
        Bank vietinBank = new VietinBank(accounts);
        vietinBank.openAccount(new SavingAccount("Nguyen Huy Nguyen", 1800000));

        vietinBank.showAccount();
    }
}
