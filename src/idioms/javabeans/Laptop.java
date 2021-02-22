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
public class Laptop {

    private String graphicCard;
    private String ram;
    private String OS;
    private String processor;
    private double screenDiagonal;

    public Laptop(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }
    

    @Override
    public String toString() {
        return "Laptop{" + "graphicCard=" + graphicCard + ", ram=" + ram + ", OS=" + OS + ", procesor=" + processor + ", screenDiagonal=" + screenDiagonal + '}';
    }

}
