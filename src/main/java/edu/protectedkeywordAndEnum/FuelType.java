package edu.protectedkeywordAndEnum;

public enum FuelType {
    ELECTRICITY("Need"),
    DIESEL("String"),
    GAS("String"),
    HYBRID("aaa"),
    PETROL("bbb");

    private final String description;
    FuelType(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
