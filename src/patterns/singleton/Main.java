/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Veljko
 */
public class Main {

    public static void main(String[] args) throws Exception {
        callingSingletonWithReflection();
    }

    private static void callingSingletonWithReflection() {
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();
        System.out.println("Both singleton instances are on same memory location:"+(singletonClass1 == singletonClass2));

        try {
            Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor(new Class[]{});
            constructor.setAccessible(true);
            SingletonClass singletonClass3 = (SingletonClass) constructor.newInstance();
        } catch (InvocationTargetException ex) {
            System.out.println("Exception. Cannot access with reflect. Only one instance is allowed");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void callingSingletonLazyInit() {
        SingletonClassLazyInitialization singletonClassLazyInitialization = SingletonClassLazyInitialization.getInstance();
        System.out.println(singletonClassLazyInitialization);
    }

    private static void callingSingletonEnum() {
        SingletonEnum.INSTANCE.metoda();
    }

}
