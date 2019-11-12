/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepatternbadcode;

/**
 *
 * @author nguyennh
 */
public abstract class Bank {

    private String user_id;
    private String bank_username;

    public Bank(String user_id, String bank_username) {
        this.user_id = user_id;
        this.bank_username = bank_username;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getBank_username() {
        return bank_username;
    }

}
