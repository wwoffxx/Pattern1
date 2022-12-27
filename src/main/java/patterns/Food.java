package patterns;

import  item.AbstractItem;

public class Food extends AbstractItem {


    public  Food(String Name,int x,int y,int z,int weight) {
        super(Name,x,y,z,weight);
    }

    @Override
    public String getItemType () {
        return "Food";
    }
    @Override
    public int getVolume() {
        int weight = this.weight;
        int borderStatement = 50;
        int CompleteSize = super.getVolume();
        CompleteSize += weight;
        if (CompleteSize < borderStatement) {
            System.out.println("Place me on the shelf.");
        }
        else {
            System.out.println("Place me to the floor.");
        }
        return CompleteSize;
    }

    @Override
    public String getPlace() {
        return "Place me to food-storage";
    }
}
