/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

import java.util.Scanner;

/**
 *
 * @author nguyennh
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("Nhập loại bánh muốn mua: ");
        String cakeName = new Scanner(System.in).nextLine();
        Cake cake = CakeFactory.getCake(cakeName);
        System.out.println(cake.getCakeName());

    }
}
