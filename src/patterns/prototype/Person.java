/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.prototype;

/**
 *
 * @author Veljko
 */
public interface Person {
    
    public Person shallowClone();
    public Person deepClone();
}
