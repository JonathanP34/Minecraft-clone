public class Item {
    private String type;
    private int numItem;
    
    public Item (String type, int numItem) {
        this.type = type;
        this.numItem = numItem;
    }
    
    // Getters
    public String getType() {
        return this.type;
    }

    public int numItem() {
        return this.numItem;
    }
    
    // Setters
    public void setType(String newType) {
        this.type = newType;
    }
    
    public void setNumItem(int newNumItem) {
        this.numItem = newNumItem;
    }

    // Methods
    
    public void removeConsumable() {
        this.hungerChange -=1;
    }
    
    public String toString() {
        String ret = "Type: " + this.type + "\nItem number: " + this.numItem;
        return ret;
    }
}
