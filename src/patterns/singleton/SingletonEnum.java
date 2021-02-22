/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.singleton;

/**
 *
 * @author Veljko
 */
public enum SingletonEnum {
    INSTANCE;

    public void metoda() {
        System.out.println("Pozivam metodu");
    }
}
