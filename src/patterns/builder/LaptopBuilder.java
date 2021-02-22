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
public class LaptopBuilder {
    
    private String graphicCard;
    private String ram;
    private String OS;
    private String processor;
    private  double screenDiagonal;
    
    public LaptopBuilder buildGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
        return this;
    }
    
    public LaptopBuilder buildRam(String ram) {
        this.ram = ram;
        return this;
    }
    
    public LaptopBuilder buildOS(String OS) {
        this.OS = OS;
        return this;
    }
    
    public LaptopBuilder buildProcesor(String processor) {
        this.processor = processor;
        return this;
    }
    
    public LaptopBuilder buildScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
        return this;
    }
    
    public Laptop buildLaptop() {
        return new Laptop(this.graphicCard, this.ram, this.OS, this.processor, this.screenDiagonal);
    }
    
}
