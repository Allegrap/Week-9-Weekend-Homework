package example.codeclan.com.shoppingbasketcodetest;

import org.junit.Before;

import example.codeclan.com.shoppingbasketcodetest.Classes.Customer;

/**
 * Created by user on 07/05/2017.
 */

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Allegra", 50, true);
    }

}
