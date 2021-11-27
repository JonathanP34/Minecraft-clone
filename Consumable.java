
package minecraft;

/**
* This is the Consumable class. This class extends Item and builds the base for a consumable item
*
* @author Christopher Vasilianu
* @date Nov 25, 2021
*/

public class Consumable extends Item{
    private double hungerChange;
    
    public Consumable(String type, int numItem, double pickPower, double weaponPower, double hungerChange) {
        super(type, numItem, pickPower, weaponPower);
        this.hungerChange = hungerChange;
    }
    
    // Getters
    public double getHungerChange() {
        return this.hungerChange;
    }

    // Setters
    public void setHungerChange(double newHungerChange) {
        this.hungerChange = newHungerChange;
    }

    // Methods
    public String toString() {
        String ret = "Type: " + this.getType() + "\nNumber of Items: " + this.getNumItem()
                + "\nHunger Change: " + this.hungerChange;
        return ret;
    }
    
}
