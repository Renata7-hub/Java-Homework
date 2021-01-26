package Exercises;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;

public class BasketTest {



    @Test
    public void addToBasket_GivenBasketIsEmpty_Adds1() {
        Basket basket = new Basket(0);
        basket.addToBasket();
        assertThat(basket.getItemsCount()).isEqualTo(1);
    }

    @Test
    public void addToBasket_GivenBasketIsFull_ThrowsException() {
        Basket basket = new Basket(10);
        assertThatThrownBy(basket::addToBasket)
                .isInstanceOf(BasketFullException.class);
    }

    @Test
    public void removeFromBasket_GivenBasketIsFull_Removes1() {
        Basket basket = new Basket(10);
        basket.removeFromBasket();
        assertThat(basket.getItemsCount()).isEqualTo(9);
    }
    @Test
    public void removeFromBasket_GivenBasketIsEmpty_ThrowsException() {
        Basket basket = new Basket(0);

        assertThatThrownBy(basket::removeFromBasket)
                .isInstanceOf(BasketEmptyException.class);
    }
    @Test
    public void newBasket_isEmpty() {
        Basket basket = new Basket();

        assertThat(basket.getItemsCount()).isEqualTo(0);
    }



}