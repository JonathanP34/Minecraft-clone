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
    public double getHungerChange() {
        return this.hungerChange;
    }

    // Setters
    public void setHungerChange(double newHungerChange) {
        this.hungerChange = newHungerChange;
    }

    // Methods
    public static void use(double newHungerChange) {
        if ((this.getHungerChange() += newHungerChange) > 10) {
            this.setHungerChange = 10;
            System.out.println("You have reached max hunger.");
        }
        this.numItem -=1;
    }

    public void ranOut() {
        if (this.numItem <= 0) {
            System.out.println ("You no longer have " + this.type);
        }
    }
}
