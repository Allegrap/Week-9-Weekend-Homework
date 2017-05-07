package example.codeclan.com.shoppingbasketcodetest.Classes;

/**
 * Created by user on 07/05/2017.
 */

public abstract class Item {

    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

}
