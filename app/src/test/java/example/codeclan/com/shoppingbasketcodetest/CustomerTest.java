package example.codeclan.com.shoppingbasketcodetest;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.shoppingbasketcodetest.Classes.Customer;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/05/2017.
 */

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Allegra", 50, true);
    }

    @Test
    public void getNameTest(){
        assertEquals("Allegra", customer.getName());
    }

    @Test
    public void getFundsTest(){
        assertEquals(50, customer.getFunds());
    }

}
