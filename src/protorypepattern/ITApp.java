/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protorypepattern;

/**
 *
 * @author nguyennh
 */
public class ITApp {

    public static void main(String[] args) {
        Computer computer1 = new Computer("Window10", "Office2019", "BKAV", "Chrome v69", "Skype");
        Computer computer2 = computer1.clone();
        computer2.setOthers("Skype, TeamViewer");

        System.out.println(computer1);
        System.out.println(computer2);
    }
}
