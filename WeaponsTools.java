public class WeaponsTools extends Item {
    private double pickPower;
    private double durability;
    private int weaponPower;

    public WeaponTool (String type, int numItem, double pickPower, double durability, int weaponPower) {
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
        return this.durability();
    }

    public int getWeaponPower() {
        return this.weaponPower;
    }

    // Setters
    public void setDurability(double newDurability) {
        this.durability = newDurability;
    }

    // Methods
    public void lowerDurability() {

    }
}