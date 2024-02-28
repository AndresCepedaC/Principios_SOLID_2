package co.edu.uniquindio.DesignPatterns.Exercise_5.model.builder;

import co.edu.uniquindio.DesignPatterns.Exercise_5.model.*;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Enum.BrandGraphicCard;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Enum.BrandProcessor;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Enum.QualityItem;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Enum.TypeCompute;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Extends.Fans;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Interface.IBuild;

public class Director {
    public void buildComputerGamer(IBuild iBuild){
        iBuild.setGabinet("Cooler Master");
        iBuild.setFans(new Fans(true, 1700,"Cooler Master"));
        iBuild.setGraphicCard(new GraphicCard(new Fans(false, 1500, "ABS"), BrandGraphicCard.AMD, QualityItem.ALTA));
        iBuild.setProcessor(new Processor("A17", BrandProcessor.AMD, 8, 16));
        iBuild.setSSD(new SSD(3400.2, 3600.5));
        iBuild.setTipeComputer(TypeCompute.GAMER);
        iBuild.setPowerSource(new PowerSource(1000));
        iBuild.setMotherBoard(new MotherBoard("AM4", 2,10,"Gigabyte"));
        iBuild.setMemoryRAM(new MemoryRAM("DDR5",6400));
    }
    public void buildComputerOffice(IBuild iBuild){
        iBuild.setGabinet("Segotep");
        iBuild.setFans(new Fans(true, 1700,"Cooler Master"));
        iBuild.setGraphicCard(new GraphicCard(new Fans(false, 1500, "ABS"), BrandGraphicCard.AMD, QualityItem.BAJA));
        iBuild.setProcessor(new Processor("A17", BrandProcessor.AMD, 8, 16));
        iBuild.setSSD(new SSD(3400.2, 3600.5));
        iBuild.setTipeComputer(TypeCompute.OFFICE);
        iBuild.setPowerSource(new PowerSource(1000));
        iBuild.setMotherBoard(new MotherBoard("AM4", 2,10,"Gigabyte"));
        iBuild.setMemoryRAM(new MemoryRAM("DDR4",3200));
    }
    public void buildComputerHome(IBuild iBuild){
        iBuild.setGabinet("Iceberg");
        iBuild.setFans(new Fans(true, 1700,"Cooler Master"));
        iBuild.setGraphicCard(new GraphicCard(new Fans(false, 1500, "ABS"), BrandGraphicCard.NVIDIA, QualityItem.MEDIA));
        iBuild.setProcessor(new Processor("A17", BrandProcessor.INTEL, 4, 8));
        iBuild.setSSD(new SSD(2600, 2000));
        iBuild.setTipeComputer(TypeCompute.HOME);
        iBuild.setPowerSource(new PowerSource(400));
        iBuild.setMotherBoard(new MotherBoard("AM3", 1,5,"Generic"));
        iBuild.setMemoryRAM(new MemoryRAM("DDR3",2400));
    }
}
