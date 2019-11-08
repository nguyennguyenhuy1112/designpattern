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
public class CakeFactory {

    private CakeFactory() {
    }

    public static CakeAbstractFactory getCake(String materialType) {
        if (materialType == null) {
            return null;
        }

        if (materialType.equalsIgnoreCase("MATCHA")) {
            return new MatchaFactory();
        } else if (materialType.equalsIgnoreCase("VANI")) {
            return new VaniFactory();
        }
        return null;
    }
}
