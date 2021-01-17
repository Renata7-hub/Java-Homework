package edu;

public abstract class Desktop {
    private String pcCase;
    private String motherboard;
    private String ram;
    private String cpu;
    private String gpu;

    public abstract void selectCase();
    public abstract void openCase();
    public abstract void closeCase();
    public abstract void Install_OS();
}
