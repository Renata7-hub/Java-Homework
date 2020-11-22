package edu.generics;
// The point of this IS NOT that different liquids are actually the same.
// So ignore that (because we could just have one class for all types...)
public class Coffee implements Liquid {
    private float amount;

    public Coffee(float amount) {
        this.amount = amount;
    }

    @Override
    public float getAmount() {
        return amount;
    }
}
