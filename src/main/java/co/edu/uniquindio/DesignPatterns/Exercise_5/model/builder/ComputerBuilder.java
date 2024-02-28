package co.edu.uniquindio.DesignPatterns.Exercise_5.model.builder;

import co.edu.uniquindio.DesignPatterns.Exercise_5.Computer;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.*;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Enum.TypeCompute;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Extends.Fans;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Interface.IBuild;

public class ComputerBuilder implements IBuild {
    private Processor processor;
    private MemoryRAM memoryRAM;
    private PowerSource powerSource;
    private SSD ssd;
    private GraphicCard graphicCard;
    private String cabinet;
    private Fans fans;
    private TypeCompute typeCompute;
    private MotherBoard motherBoard;
    @Override
    public void setTipeComputer(TypeCompute typeCompute) {

    }

    @Override
    public void setProcessor(Processor processor) {

    }

    @Override
    public void setMemoryRAM(MemoryRAM memoryRAM) {

    }

    @Override
    public void setPowerSource(PowerSource powerSource) {

    }

    @Override
    public void setGraphicCard(GraphicCard graphicCard) {

    }

    @Override
    public void setSSD(SSD ssd) {

    }

    @Override
    public void setGabinet(String gabinet) {

    }

    @Override
    public void setFans(Fans fans) {

    }

    @Override
    public void setMotherBoard(MotherBoard motherBoard) {

    }

    public Computer getResult(){
        return new Computer(processor,memoryRAM,powerSource,ssd,graphicCard,cabinet,fans, typeCompute, motherBoard);
    }
}
