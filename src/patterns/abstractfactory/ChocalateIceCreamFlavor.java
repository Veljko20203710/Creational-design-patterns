/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.abstractfactory;

/**
 *
 * @author Veljko
 */
public class ChocalateIceCreamFlavor implements IceCreamFlavor {

    @Override
    public void showFlawor() {
        System.out.println("Chocolate ice cream flavor.");
    }

}
