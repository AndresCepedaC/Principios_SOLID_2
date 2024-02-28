package co.edu.uniquindio.DesignPatterns.Exercise_5;

import co.edu.uniquindio.DesignPatterns.Exercise_5.model.*;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Enum.TypeCompute;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Extends.Fans;

public class Computer {
    private final Processor processor;
    private final MemoryRAM memoryRAM;
    private final PowerSource powerSource;
    private final SSD ssd;
    private final GraphicCard graphicCard;
    private String cabinet;
    private Fans fans;
    private final TypeCompute typeCompute;
    private final MotherBoard motherBoard;

    public Computer(Processor processor, MemoryRAM memoryRAM,
                    PowerSource powerSource, SSD ssd, GraphicCard graphicCard,
                    String cabinet, Fans fans,
                    TypeCompute typeCompute, MotherBoard motherBoard) {
        this.processor = processor;
        this.memoryRAM = memoryRAM;
        this.powerSource = powerSource;
        this.ssd = ssd;
        this.graphicCard = graphicCard;
        this.cabinet = cabinet;
        this.fans = fans;
        this.typeCompute = typeCompute;
        this.motherBoard = motherBoard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public MemoryRAM getMemoryRAM() {
        return memoryRAM;
    }

    public PowerSource getPowerSource() {
        return powerSource;
    }

    public SSD getSsd() {
        return ssd;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public String getCabinet() {
        return cabinet;
    }

    public Fans getFans() {
        return fans;
    }

    public TypeCompute getTipeComputer() {
        return typeCompute;
    }
}
