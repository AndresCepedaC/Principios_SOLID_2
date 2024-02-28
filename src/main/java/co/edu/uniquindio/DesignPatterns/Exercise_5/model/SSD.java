package co.edu.uniquindio.DesignPatterns.Exercise_5.model;

public class SSD {
    private double speedRead;
    private double speedWriting;

    public SSD(double speedRead, double speedWriting) {
        this.speedRead = speedRead;
        this.speedWriting = speedWriting;
    }

    public double getSpeedRead() {
        return speedRead;
    }

    public void setSpeedRead(double speedRead) {
        this.speedRead = speedRead;
    }

    public double getSpeedWriting() {
        return speedWriting;
    }

    public void setSpeedWriting(double speedWriting) {
        this.speedWriting = speedWriting;
    }
}
