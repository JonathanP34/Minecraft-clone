package minecraft;

/**
* This is the Item class. It is a base to everything that can be considered an item
*
* @author Christopher Vasilianu and Jonathan Peters
* @date Nov 25, 2021
*/

public class Item {
    private String type;
    private int numItem;
    private double pickPower;
    private double weaponPower;
    
    public Item (String type, int numItem, double pickPower, double weaponPower) {
        this.type = type;
        this.numItem = numItem;
        this.pickPower = pickPower;
        this.weaponPower = weaponPower;
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
    
    // Methods
    
    public void removeConsumable() {
        this.numItem -=1;
    }
    
    public static Item[] generateInventory() {
        Item[] inventory = new Item[3];
        inventory[0] = new WeaponTools("Pickaxe", 1, 5, 100, 2);
        inventory[1] = new WeaponTools("Sword", 1, 1, 100, 10);
        inventory[2] = new Consumable("Beef", 64, 3.0, 0.1, 0.1);
        
        return inventory;
    }
    
    public String toString() {
        String ret = "Type: " + this.type + "\nItem number: " + this.numItem;
        return ret;
    }
}