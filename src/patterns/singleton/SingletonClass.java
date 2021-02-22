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
public class SingletonClass {

    private static SingletonClass singletonInstance;

    static {
        singletonInstance = new SingletonClass();
    }

    private SingletonClass() throws MultipleInstancesException {
        if (singletonInstance != null) {
            throw new MultipleInstancesException();
        }
    }

    public static SingletonClass getInstance() {
        return singletonInstance;
    }
}
