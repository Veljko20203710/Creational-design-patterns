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
public class Laptop {

    private String graphicCard;
    private String ram;
    private String OS;
    private String processor;
    private double screenDiagonal;

    public Laptop(double screenDiagonal) {
        this(screenDiagonal, null);
    }

    public Laptop(double screenDiagonal, String processor) {
        this(screenDiagonal, processor, null);
    }

    public Laptop(double screenDiagonal, String processor, String ram) {
        this(screenDiagonal, processor, ram, null);
    }

    public Laptop(double screenDiagonal, String processor, String ram, String graphicCard) {
        this(screenDiagonal, processor, ram, graphicCard, null);
    }

    public Laptop(double screenDiagonal, String processor, String ram, String graphicCard, String OS) {
        this.graphicCard = graphicCard;
        this.ram = ram;
        this.OS = OS;
        this.processor = processor;
        this.screenDiagonal = screenDiagonal;
    }
   

    @Override
    public String toString() {
        return "Laptop{" + "graphicCard=" + graphicCard + ", ram=" + ram + ", OS=" + OS + ", procesor=" + processor + ", screenDiagonal=" + screenDiagonal + '}';
    }

}
