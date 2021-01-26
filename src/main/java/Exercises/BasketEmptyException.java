package Exercises;

public class BasketEmptyException extends RuntimeException {
    BasketEmptyException() {
        super("BasketEmptyException -Basket is empty");
    }
}
