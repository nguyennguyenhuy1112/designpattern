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
public class SavingAccount implements Account {

    private String name;
    private float balance;

    public SavingAccount(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public void openAccount() {
        System.out.println("create Saving Account!\n");
    }

    @Override
    public String toString() {
        return "SavingAccount: " + "name=" + name + ", balance=" + balance + " VND";
    }

}
