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
public class ChocolateConeIceCream implements AbstractIceCreamFactory{

    @Override
    public IceCreamType createIceCreamType() {
        return new IceCreamCone();
    }

    @Override
    public IceCreamFlavor createIceCreamFlavor() {
        return new ChocalateIceCreamFlavor();
    }
    
}
