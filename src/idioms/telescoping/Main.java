/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idioms.telescoping;

/**
 *
 * @author Veljko
 */
public class Main {

    public static void main(String[] args) {
        minimumLaptop();
        laptopWithRam();
        laptopWithProcessor();
        fullLaptop();
    }

    private static void minimumLaptop() {
        Laptop laptop = new Laptop(20);
        System.out.println(laptop);
    }

    private static void laptopWithRam() {
        Laptop laptop = new Laptop(20, null, "8 GB");
        System.out.println(laptop);
    }
    
     private static void laptopWithProcessor() {
        Laptop laptop = new Laptop(0, "Intel core");
        System.out.println(laptop);
    }

    private static void fullLaptop() {
        Laptop laptop = new Laptop(20, "Intel core", "8 GB", "GeForce", "WINDOWS 10");
        System.out.println(laptop);
    }
}
