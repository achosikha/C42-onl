package lesson_9_abstract_interf.PC;

import lesson_9_abstract_interf.PC.Parts.*;

public class MyComputer {
    private CPU cpu;
    private Case pcCase;
    private Baseboard baseboard;
    private Cooler cooler;
    private HDD hdd;
    private RAM ram;

    public MyComputer(){
        this(new CPU("Unknown", "Unknown", 0, 0, 0),
                new Case("Unknown", "Unknown", true,
                        new String[]{}, 0),
                new Baseboard("Unknown", "Unknown", new String[]{},
                        0, 0),
                new Cooler("Unknown", "Unknown", 0, 0, 0),
                new HDD("Unknown", "Unknown", 0, 0, 0),
                new RAM("Unknown", "Unknown", "Unknown", 0, 0));
    }

    public MyComputer(CPU cpu){
        this(cpu,
                new Case("Unknown", "Unknown", true,
                        new String[]{}, 0),
                new Baseboard("Unknown", "Unknown", new String[]{},
                        0, 0),
                new Cooler("Unknown", "Unknown", 0, 0, 0),
                new HDD("Unknown", "Unknown", 0, 0, 0),
                new RAM("Unknown", "Unknown", "Unknown", 0, 0));
    }

    public MyComputer(CPU cpu, Case pcCase){
        this(cpu,
                pcCase,
                new Baseboard("Unknown", "Unknown", new String[]{"VGA", "AUDIO", "TK"},
                        0, 0),
                new Cooler("Unknown", "Unknown", 0, 0, 0),
                new HDD("Unknown", "Unknown", 0, 0, 0),
                new RAM("Unknown", "Unknown", "Unknown", 0, 0));
    }

    public MyComputer(CPU cpu, Case pcCase, Baseboard baseboard){
        this(cpu,
                pcCase,
                baseboard,
                new Cooler("Unknown", "Unknown", 0, 0, 0),
                new HDD("Unknown", "Unknown", 0, 0, 0),
                new RAM("Unknown", "Unknown", "Unknown", 0, 0));
    }

    public MyComputer(CPU cpu, Case pcCase, Baseboard baseboard, Cooler cooler){
        this(cpu,
                pcCase,
                baseboard,
                cooler,
                new HDD("Unknown", "Unknown", 0, 0, 0),
                new RAM("Unknown", "Unknown", "Unknown", 0, 0));
    }

    public MyComputer(CPU cpu, Case pcCase, Baseboard baseboard, Cooler cooler, HDD hdd){
        this(cpu,
                pcCase,
                baseboard,
                cooler,
                hdd,
                new RAM("Unknown", "Unknown", "Unknown", 0, 0));
    }

    public MyComputer(CPU cpu, Case pcCase, Baseboard baseboard, Cooler cooler, HDD hdd, RAM ram){
        this.cpu = cpu;
        this.baseboard = baseboard;
        this.pcCase = pcCase;
        this.cooler = cooler;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "PC:\n\t" +
                "CASE:" + this.pcCase +
                "\n\tCPU:" + this.cpu +
                "\n\tBaseboard:" + this.baseboard +
                "\n\tCooler:" + this.cooler +
                "\n\tHDD:" + this.hdd +
                "\n\tRADM:" + this.ram;
    }
}