package co.edu.uniquindio.DesignPatterns.Exercise_5.model.Extends;

public class Fans {
    private int quantityFans;
    private boolean started;
    private int RPM;
    private String brand;

    public Fans(boolean started, int RPM, String brand) {
        this.started = started;
        this.RPM = RPM;
        this.brand = brand;
    }
    public void on(){
        started = true;
    }
    public void off (){
        started = false;
    }
    public int getRPM() {
        return RPM;
    }

    public void setRPM(int RPM) {
        this.RPM = RPM;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
