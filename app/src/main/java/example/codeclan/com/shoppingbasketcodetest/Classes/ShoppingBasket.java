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
        this.items = new ArrayList<Item>();
    }

//    public String getCustomer(){
//        return customer;
//    }

//    public int getCustomerFunds() {
//        return customer.getFunds();
//    }

    public void addToBasket(Item item){
        items.add(item);
    }

    public void emptyBasket(){
        items.clear();
    }

    public int getItemsQuantity(){
        return items.size();
    }

}
