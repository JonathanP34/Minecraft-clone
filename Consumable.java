/**
* This is the Consumable class. This class extends Item and builds the base for a consumable item
*
* @author Christopher Vasilianu
* @date Nov 25, 2021
*/

public class Consumable extends Item{
    private double hungerChange;
    
    public Consumable (String type, int numItem, double hungerChange) {
        super (type, numItem);
        this.hungerChange = hungerChange;
    }
    
    // Getters
    public double hungerChange() {
        return this.hungerChange;
    }

    // Setters
    public void setHungerChange(double newHungerChange) {
        this.hungerChange = newHungerChange;
    }

    // Methods
}
