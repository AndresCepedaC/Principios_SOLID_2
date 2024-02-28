package co.edu.uniquindio.DesignPatterns;

import co.edu.uniquindio.DesignPatterns.Exercise_5.Computer;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Manual;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.builder.ComputerBuilder;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.builder.ComputerManualBuilder;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.builder.Director;

public class mainComputer {
    public static void main(String[] args) {
        example();
    }

    private static void example() {
        Director director = new Director();

        ComputerBuilder builder = new ComputerBuilder();
        director.buildComputerGamer(builder);

        Computer computer = builder.getResult();

        ComputerManualBuilder manualComputerBuilder = new ComputerManualBuilder();

        director.buildComputerGamer(manualComputerBuilder);

        Manual computerManual1 = manualComputerBuilder.getResult();
        System.out.println(computerManual1.print());
    }
}
