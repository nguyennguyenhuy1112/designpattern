/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author nguyennh
 */
public class Client {
    public static void main(String[] args) {
        CakeAbstractFactory cake = CakeFactory.getCake("MATCHA");
        
        Cookies cookies = cake.createCookies();
        cookies.create();
        
        CupCake cupcake = cake.createCupCake();
        cupcake.create();
    }
}
