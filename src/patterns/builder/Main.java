/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.builder;

/**
 *
 * @author Veljko
 */
public class Main {

    public static void main(String[] args) {
        createLaptopOutsideBuilder();
        createLaptopInnerBuilder();
    }
    
    private static void createLaptopOutsideBuilder() {
        Laptop laptop = new LaptopBuilder()
                .buildScreenDiagonal(15)
                .buildProcesor("PROCESOR")
                .buildGraphicCard("AM")
                .buildOS("WINDOWS 10")
                .buildRam("8 GB")
                .buildLaptop();
        System.out.println(laptop);
    }
    
    private static void createLaptopInnerBuilder() {
        LaptopWithInnerBuilder laptop2 = new LaptopWithInnerBuilder.LaptopBuilder()
                .buildScreenDiagonal(15)
                .buildProcesor("PROCESOR")
                .buildGraphicCard("AM")
                .buildOS("WINDOWS 10")
                .buildRam("8 GB")
                .buildLaptop();   
        System.out.println(laptop2);
    }
}
