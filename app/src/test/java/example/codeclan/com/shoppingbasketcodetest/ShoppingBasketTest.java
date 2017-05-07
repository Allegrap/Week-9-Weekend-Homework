package example.codeclan.com.shoppingbasketcodetest;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.shoppingbasketcodetest.Classes.Customer;
import example.codeclan.com.shoppingbasketcodetest.Classes.ShoppingBasket;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/05/2017.
 */

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Customer customer1;

    @Before
    public void before(){
        shoppingBasket = new ShoppingBasket(customer1);
        customer1 = new Customer("Allegra", 50, true);
    }

//    @Test
//    public void getCustomerNameTest(){
//        assertEquals("Allegra", shoppingBasket.getCustomerName());
//    }
//
//    @Test
//    public void getCustomerFundsTest(){
//        assertEquals(50, shoppingBasket.getCustomerFunds());
//    }

    @Test
    public void addItemToBasketTest(){

    }

}
