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
public class SavingAccount implements Account{

    @Override
    public void openAccount() {
        System.out.println("Mở tài khoản tiết kiệm");
    }
    
}
