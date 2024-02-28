package co.edu.uniquindio.DesignPatterns.Exercise_5.model;

public class MemoryRAM {
    private String generation;
    private double velocity;

    public MemoryRAM(String generation, double velocity) {
        this.generation = generation;
        this.velocity = velocity;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }
}
