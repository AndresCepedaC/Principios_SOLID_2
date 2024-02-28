package co.edu.uniquindio.DesignPatterns.Exercise_5.model;

public class MotherBoard {
    private String zocalo;
    private int slotsPCI;
    private int quantityPorts;
    private String Brand;

    public MotherBoard(String zocalo, int slotsPCI, int quantityPorts, String brand) {
        this.zocalo = zocalo;
        this.slotsPCI = slotsPCI;
        this.quantityPorts = quantityPorts;
        Brand = brand;
    }

    public String getZocalo() {
        return zocalo;
    }

    public void setZocalo(String zocalo) {
        this.zocalo = zocalo;
    }

    public int getSlotsPCI() {
        return slotsPCI;
    }

    public void setSlotsPCI(int slotsPCI) {
        this.slotsPCI = slotsPCI;
    }

    public int getQuantityPorts() {
        return quantityPorts;
    }

    public void setQuantityPorts(int quantityPorts) {
        this.quantityPorts = quantityPorts;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }
}
