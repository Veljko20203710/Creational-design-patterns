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
public class IceCreamCup implements IceCreamType{
    
    @Override
    public void showIceCreamType() {
        System.out.println("Cup type ice cream.");
    }
}
