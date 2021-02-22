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
public class LaptopWithInnerBuilder {

    private String graphicCard;
    private String ram;
    private String OS;
    private String procesor;
    private double screenDiagonal;

    private LaptopWithInnerBuilder(LaptopBuilder laptopBuilder) {
        this.graphicCard = laptopBuilder.graphicCard;
        this.ram = laptopBuilder.ram;
        this.OS = laptopBuilder.OS;
        this.procesor = laptopBuilder.procesor;
        this.screenDiagonal = laptopBuilder.screenDiagonal;
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
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    @Override
    public String toString() {
        return "LaptopWithInnerBuilder{" + "graphicCard=" + graphicCard + ", ram=" + ram + ", OS=" + OS + ", procesor=" + procesor + ", screenDiagonal=" + screenDiagonal + '}';
    }

    public static class LaptopBuilder {

        private String graphicCard;
        private String ram;
        private String OS;
        private String procesor;
        private double screenDiagonal;

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

        public LaptopBuilder buildProcesor(String procesor) {
            this.procesor = procesor;
            return this;
        }

        public LaptopBuilder buildScreenDiagonal(double screenDiagonal) {
            this.screenDiagonal = screenDiagonal;
            return this;
        }
        
        public LaptopWithInnerBuilder buildLaptop() {
            return new LaptopWithInnerBuilder(this);
        }
    }
}
