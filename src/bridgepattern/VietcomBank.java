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
public class VietcomBank extends Bank{

    public VietcomBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        account.openAccount();
    }
    
}
