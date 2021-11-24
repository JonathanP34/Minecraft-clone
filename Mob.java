/**
 * Jonathan
 * Class for the mob class
 */
package minecraft;

public class Mob extends MovingThing {
    private boolean friendly;
    private String drop; //Should be the actual item class
    private int dropAmount;
    
    public Mob(int x, int y, int z, int hp, int height, int width, int length, String type, boolean friendly, String drop, int dropAmount) {
        super(x, y ,z ,hp, height, width, length, type);
        this.friendly = friendly;
        this.drop = drop;
        this.dropAmount = dropAmount;
    }
    
    //Getters
    public boolean getFriendly() {
        return this.friendly;
    }
    
    public String getDrop() {
        return this.drop;
    }
    
    public int getDropAmount() {
        return this.dropAmount;
    }
    
    //Setters
    public void setFriendly(boolean newFriendly) {
        this.friendly = newFriendly;
    }
    
    public void setDrop(String newDrop) {
        this.drop = newDrop;
    }
    
    public void setDropAmount(int newDropAmount) {
        this.dropAmount = newDropAmount;
    }
    
    //Methods that do something
    
    /* - Mobs arnt gonna move, losers
    public void moveMob(int newX, int newY, int newZ) {
        
    }
    */
    
    public String toString() {
        String ret = "x: " + this.getX() + " y: " + this.getY() + " z: " + 
                    this.getZ() + "\nHeight: " + this.getHeight() + " Width:" +
                    this.getWidth() + " Length: " + this.getLength() +"\nHP: "
                    + this.getHp() + " Type: " + this.getType() + "\nFriendly: " +
                    this.friendly + " Drop: " + this.drop + " Number of Drops: " + 
                    this.dropAmount;
        return ret;
    }
}
