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
public class Main {

    public static void main(String[] args) {
        createVanilaCupIceCream();
        System.out.println("====================");
        createChocolateConeIceCream();
    }
    
     private static void createVanilaCupIceCream() {
        AbstractIceCreamFactory factory = new VanilaCupIceCream();
        IceCreamType iceCreamType = factory.createIceCreamType();
        iceCreamType.showIceCreamType();
        IceCreamFlavor iceCreamFlavor = factory.createIceCreamFlavor();
        iceCreamFlavor.showFlawor();
    }
    
    private static void createChocolateConeIceCream() {
        AbstractIceCreamFactory factory = new ChocolateConeIceCream();
        IceCreamType iceCreamType = factory.createIceCreamType();
        iceCreamType.showIceCreamType();
        IceCreamFlavor iceCreamFlavor = factory.createIceCreamFlavor();
        iceCreamFlavor.showFlawor();
    }
}
