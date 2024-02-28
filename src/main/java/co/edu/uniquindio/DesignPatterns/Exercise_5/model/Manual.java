package co.edu.uniquindio.DesignPatterns.Exercise_5.model;

import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Enum.TypeCompute;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Extends.Fans;

public class Manual {
    private final Processor processor;
    private final MemoryRAM memoryRAM;
    private final PowerSource powerSource;
    private final SSD ssd;
    private final GraphicCard graphicCard;
    private final String cabinet;
    private final Fans fans;
    private final TypeCompute typeCompute;
    private final MotherBoard motherBoard;

    public Manual(Processor processor, MemoryRAM memoryRAM, PowerSource powerSource, SSD ssd, GraphicCard graphicCard, String cabinet, Fans fans, TypeCompute typeCompute, MotherBoard motherBoard) {
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

    public String print() {

        return "Manual{" +
                "processor=" + processor +
                ", memoryRAM=" + memoryRAM +
                ", powerSource=" + powerSource +
                ", ssd=" + ssd +
                ", graphicCard=" + graphicCard +
                ", cabinet='" + cabinet + '\'' +
                ", fans=" + fans +
                ", typeCompute=" + typeCompute +
                ", motherBoard=" + motherBoard +
                '}';
    }
}
