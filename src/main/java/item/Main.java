package item;

import item.AbstractItem;
import patterns.Food;
import patterns.Fragile;
import patterns.Clothes;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main( String[] args )
    {

        List<AbstractItem> ItemList = new ArrayList<>();

        //scan items and send to distribute
        ItemList.add(new Food("Freezed Vegetables", 2, 1, 1, 4));
        ItemList.add(new Fragile("Glass",2 ,1 , 2, 2));
        ItemList.add(new Clothes("Shirt", 2, 2,2, 3));


        for (AbstractItem item : ItemList){

            System.out.println(item.getName());
            System.out.println(item.getVolume());
            System.out.println(item.getItemType());
            System.out.println(item.getPlace());

        }


    }
}