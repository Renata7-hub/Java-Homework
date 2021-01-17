package edu;

public class MICROSOFTmakePC implements OperationToMakeDesktop{

         @Override
        public void PlantMotherboard() {
            System.out.println("Plant MICROSOFT motherboard");
        }

        @Override
        public void PlantRAM() {
            System.out.println("Plant MICROSOFT Ram");
        }

        @Override
        public void PlantCPU() {
            System.out.println("Plant MICROSOFT CPU");
        }

        @Override
        public void PlantGPU() {
            System.out.println("Plant MICROSOFT GPU");
         }
}
