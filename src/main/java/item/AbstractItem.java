package item;

public abstract class AbstractItem extends Size {

    protected String Name;

    public String getItemType () {
        return "Undeclared type";
    }
    public AbstractItem (String Name,int x,int y,int z,int weight) {
        this.Name = Name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.weight = weight;
    }
    public String getName() {
        return this.Name;
    }

    public int getVolume() {
        int i = this.x*this.y*this.z;
        return i;
    }

    public String getPlace() {
        return "Can't solve,place me to the buffer-zone.";
    }

}
