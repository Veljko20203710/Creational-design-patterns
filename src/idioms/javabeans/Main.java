/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idioms.javabeans;

/**
 *
 * @author Veljko
 */
public class Main {
    public static void main(String[] args) {
            Laptop laptop = new Laptop(15);
            laptop.setRam("16 GB");
            laptop.setOS("WINDOWS 10");
            laptop.setProcessor("Intel Core");
            laptop.setGraphicCard("GeForce");
            System.out.println(laptop);
    }
}
