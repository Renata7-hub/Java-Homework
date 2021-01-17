package edu;

public class MACmakePC implements OperationToMakeDesktop{

    @Override
    public void PlantMotherboard() {
        System.out.println("Plant MAC motherboard");
    }

    @Override
    public void PlantRAM() {
        System.out.println("Plant MAC Ram");
    }

    @Override
    public void PlantCPU() {
        System.out.println("Plant MAC CPU");

    }

    @Override
    public void PlantGPU() {
        System.out.println("Plant MC GPU");
    }
}
