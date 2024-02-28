package co.edu.uniquindio.DesignPatterns.Exercise_5.model.Interface;

import co.edu.uniquindio.DesignPatterns.Exercise_5.model.*;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Enum.TypeCompute;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Extends.Fans;

public interface IBuild {
    void setTipeComputer(TypeCompute typeCompute);
    void setProcessor(Processor processor);
    void setMemoryRAM(MemoryRAM memoryRAM);
    void setPowerSource(PowerSource powerSource);
    void setGraphicCard(GraphicCard graphicCard);
    void setSSD(SSD ssd);
    void setGabinet(String gabinet);
    void setFans(Fans fans);
    void setMotherBoard(MotherBoard motherBoard);
}
