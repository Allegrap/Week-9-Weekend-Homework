package example.codeclan.com.shoppingbasketcodetest.Classes;

import java.util.ArrayList;

import example.codeclan.com.shoppingbasketcodetest.Classes.Customer;
import example.codeclan.com.shoppingbasketcodetest.Classes.Item;

/**
 * Created by user on 07/05/2017.
 */

public class ShoppingBasket {

    private ArrayList<Item> items;
    private Customer customer;

    public ShoppingBasket(Customer customer){
        this.customer = customer;
    }

    public String getCustomerName(){
        return customer.getName();
    }

}
