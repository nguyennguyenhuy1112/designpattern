/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author nguyennh
 */
public class CakeFactory {

    public static Cake getCake(String cakeName) {
        
        
        if (cakeName == null) {
            return null;
        }
        if (cakeName.equalsIgnoreCase("COOKIES")) {
            return new Cookies();
        } else if (cakeName.equalsIgnoreCase("CUPCAKE")) {
            return new CupCake();
        } else {
            System.out.println("Không bán loại bánh này");
        }
        return null;
    }
}
