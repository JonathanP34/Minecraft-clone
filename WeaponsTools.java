/**
* This is the Weapon class. Tihs class extends Item and builds the base for a weapon
*
* @author Christopher Vasilianu
* @date Nov 25, 2021
*/

public class WeaponsTools extends Item{
    private double pickPower;
    private double durability;
    private int weaponPower;
    
    public WeaponsTools (String type, int numItem, double pickPower, double durability, int weaponPower) {
        super (type, numItem);
        this.pickPower = pickPower;
        this.durability = durability;
        this.weaponPower = weaponPower;
    }
    
    // Getters
    public double getPickPower() {
        return this.pickPower;
    }

    public double getDurability() {
        return this.durability;
    }

    public int getWeaponPower() {
        return this.weaponPower;
    }

    // Setters
    public void setDurability(double newDurability) {
        this.durability = newDurability;
    }

    // Methods
    public void mineBlock() {
        this.durability -=1;
    }

    public void breaking() {
        if (this.durability <= 0) {
            System.out.println ("Your " + this.type + " broke.");
        }
    }
}
