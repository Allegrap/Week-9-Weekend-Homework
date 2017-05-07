package example.codeclan.com.shoppingbasketcodetest.Classes;

import example.codeclan.com.shoppingbasketcodetest.Interfaces.Discountable;

/**
 * Created by user on 07/05/2017.
 */

public class Bagel extends Item implements Discountable{

    public Bagel(String name, int price, int quantity){
        super(name, price, quantity);
    }

    public void discount(){

    }

}
