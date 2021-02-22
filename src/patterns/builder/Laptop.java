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
public class Laptop {
    
    private String graphicCard;
    private String ram;
    private String OS;
    private String processor;
    private double screenDiagonal;

    public Laptop(String graphicCard, String ram, String OS, String processor, double screenDiagonal) {
        this.graphicCard = graphicCard;
        this.ram = ram;
        this.OS = OS;
        this.processor = processor;
        this.screenDiagonal = screenDiagonal;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getProcesor() {
        return processor;
    }

    public void setProcesor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Laptop{" + "graphicCard=" + graphicCard + ", ram=" + ram + ", OS=" + OS + ", procesor=" + processor + ", screenDiagonal=" + screenDiagonal + '}';
    }
    
    
    
    
}
