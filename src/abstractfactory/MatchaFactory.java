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
public class MatchaFactory extends CakeAbstractFactory{

    @Override
    public CupCake createCupCake() {
        return new MatchaCupCake();
    }

    @Override
    public Cookies createCookies() {
        return new MatchaCookies();
    }
    
}
