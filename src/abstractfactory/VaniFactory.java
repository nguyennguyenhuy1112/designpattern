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
public class VaniFactory extends CakeAbstractFactory{

    @Override
    public CupCake createCupCake() {
        return new VaniCupCake();
    }

    @Override
    public Cookies createCookies() {
        return new VaniCookies();
    }
    
}
