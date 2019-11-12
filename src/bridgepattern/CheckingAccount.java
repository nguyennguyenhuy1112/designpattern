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
public class CheckingAccount implements Account {

    private String name;
    private float balance;

    public CheckingAccount(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public void openAccount() {
        System.out.println("Create Checking Account!\n");
    }

    @Override
    public String toString() {
        return "CheckingAccount: " + "name=" + name + ", balance=" + balance + " VND";
    }

}
