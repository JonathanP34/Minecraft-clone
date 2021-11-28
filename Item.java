/**
* This is the Item class. It is a base to everything that can be considered an item, however, nothing currently extends the class for simplicities sake
*
* @author Christopher Vasilianu and Jonathan Peters
* @date Nov 25, 2021
*/

public class Item {
    private String type;
    private int numItem;
    private double pickPower;
    private double weaponPower;
    private double hungerChange;
    private double durability;
    
    public Item (String type, int numItem, double pickPower, double weaponPower, double hungerChange, double durability) {
        this.type = type;
        this.numItem = numItem;
        this.pickPower = pickPower;
        this.weaponPower = weaponPower;
        this.hungerChange = hungerChange;
        this.durability = durability;
    }
    
    // Getters
    public String getType() {
        return this.type;
    }

    public int getNumItem() {
        return this.numItem;
    }
    
    public double getPickPower() {
        return this.pickPower;
    }
    
    public double getWeaponPower() {
        return this.weaponPower;
    }
    
    public double getDurability() {
        return this.durability;
    }

    public double getHungerChange() {
        return this.hungerChange;
    }

    // Setters
    public void setType(String newType) {
        this.type = newType;
    }
    
    public void setNumItem(int newNumItem) {
        this.numItem = newNumItem;
    }
    
    public void setWeaponPower(double newWeaponPower){
        this.weaponPower = newWeaponPower;
    }
    
    public void setPickPower(double newPickPower) {
        this.pickPower = newPickPower;
    }
    
    public void setHungerChange(double newHungerChange) {
        this.hungerChange = newHungerChange;
    }

    public void setDurability(double newDurability) {
        this.durability = newDurability;
    }
    // Methods
    
    //Removing the consumable/decresaing it by one when it breaks
    public void removeConsumable() {
        this.numItem -= 1;
    }
    
    //Reducing durability of the item
    public void lowerDurability() {
      this.durability -= 5;
    }

    //Generating 3 instances of the item classm two of which are tools, the other is food
    public static Item[] generateInventory() {
        Item[] inventory = new Item[3];
        inventory[0] = new Item("Pickaxe", 1, 15, 5, 0, 100);
        inventory[1] = new Item("Sword", 1, 5, 20, 0, 100);
        inventory[2] = new Item("Beef", 64, 1, 1, 10, 50);
        
        return inventory;
    }
    
    //Outputting all of the stats of the item
    public String toString() {
        String ret = "Type: " + this.type + "\nItem number: " + this.numItem + "\nPick Power: " + this.pickPower + "\nSword Power: " + this.weaponPower + "\nHunger Change: " + this.hungerChange + "\nDurability: " + this.durability;
        return ret;
    }
}
