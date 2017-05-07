package example.codeclan.com.shoppingbasketcodetest;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.shoppingbasketcodetest.Classes.Banana;
import example.codeclan.com.shoppingbasketcodetest.Classes.Customer;
import example.codeclan.com.shoppingbasketcodetest.Classes.ShoppingBasket;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/05/2017.
 */

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Customer customer1;
    Banana banana;

    @Before
    public void before(){
        shoppingBasket = new ShoppingBasket(customer1);
        customer1 = new Customer("Allegra", 50, true);
        banana = new Banana(2, 1);
    }

//    @Test
//    public void getCustomerTest(){
//        assertEquals("Allegra 50 true", shoppingBasket.getCustomer());
//    }
//
//    @Test
//    public void getCustomerFundsTest(){
//        assertEquals(50, shoppingBasket.getCustomerFunds());
//    }

    @Test
    public void addItemToBasketTest(){
        shoppingBasket.addToBasket(banana);
        assertEquals(1, shoppingBasket.getItemsQuantity());
    }

    @Test
    public void emptyBasketTest() {
        shoppingBasket.addToBasket(banana);
        shoppingBasket.emptyBasket();
        assertEquals(0, shoppingBasket.getItemsQuantity());
    }

}
