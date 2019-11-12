/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepatternbadcode;

import bridgepatternbadcode.acb.ACB;
import bridgepatternbadcode.acb.SavingAccount;
import bridgepatternbadcode.vietinbank.CheckingAccount;
import bridgepatternbadcode.vietinbank.VietinBank;

/**
 *
 * @author nguyennh
 */
public class Client {

    public static void main(String[] args) {
        VietinBank user1 = new VietinBank("user1", "Nguyen");
        CheckingAccount checking_user1 = user1.createCheckingAccount("checking_user1", "Nguyen checking account", 1800000);
        System.out.println(checking_user1.toString());

        ACB user2 = new ACB("user2", "Nam");
        SavingAccount savingAccount = user2.createSavingAccount("saving_user2", "Nam saving account", 19000000);
        System.out.println(savingAccount.toString());
    }
}
