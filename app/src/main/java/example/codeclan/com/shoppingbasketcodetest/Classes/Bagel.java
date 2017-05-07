package example.codeclan.com.shoppingbasketcodetest.Classes;

import example.codeclan.com.shoppingbasketcodetest.Interfaces.Discountable;

/**
 * Created by user on 07/05/2017.
 */

public class Bagel extends Item implements Discountable{

    public Bagel(int price, int quantity){
        super(price, quantity);
    }

    public void discount(){

    }

}
