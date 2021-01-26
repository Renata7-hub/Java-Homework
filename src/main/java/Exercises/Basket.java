package Exercises;

public class Basket {

    public final int maxCapacity = 10;
    private int itemsCount;

    public Basket(int itemsCount) {
        this.itemsCount = itemsCount;
    }
    public Basket() {
            }

    public void addToBasket() {
        if (itemsCount >= maxCapacity) {
            throw new BasketFullException();
        }
        itemsCount++;
        }

    public void removeFromBasket() {
        if (itemsCount < 1) {
            throw new BasketEmptyException();
        }
        itemsCount--;
    }

    public int getItemsCount() {
        return itemsCount;
    }
}
