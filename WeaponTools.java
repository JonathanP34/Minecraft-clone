/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minecraft;

/**
* This is the Weapon class. This class extends Item and builds the base for a weapon
*
* @author Christopher Vasilianu and Jonathan Peters
* @date Nov 25, 2021
*/

public class WeaponTools extends Item {
    private double durability;

    public WeaponTools(String type, int numItem, double pickPower, double durability, int weaponPower) {
        super(type, numItem, pickPower, weaponPower);
        this.durability = durability;
    }

    // Getters
    
    public double getDurability() {
        return this.durability;
    }

    // Setters
    public void setDurability(double newDurability) {
        this.durability = newDurability;
    }

    // Methods
    public void lowerDurability() {
        this.durability -= 5;
    }
    
    public String toString() {
        String ret = "Type: " + this.getType() + "\nNumber of Item: " + this.getNumItem() + 
                    "\nPick Power: " + this.getPickPower() + "\nDurability: " + this.durability +
                    "\nWeapon Power: " + this.getWeaponPower();
        return ret;
    }
}
