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
    public void removeConsumable() {
      this.hungerChange - 1 = this.hungerChange;
    }
}