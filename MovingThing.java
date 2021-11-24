/**
 * Writer: Jonathan
 * Making the moving this super class
 */
package minecraft;

/**
 *
 * @author Jonathan Peters
 */
public class MovingThing {
    private int x,y,z;
    private int hp;
    private int height, width, length;
    private String type;
    //could add invetory[] here too
    
    public MovingThing(int x, int y, int z, int hp, int height, int width, int length, String type) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.hp = hp;
        this.height = height;
        this.width = width;
        this.length = length;
        this.type = type;
    }
    
    //Getter methods
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public int getZ() {
        return this.z;
    }
    
    public int getHp() {
        return this.hp;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }
    
    public String getType() {
        return this.type;
    }
    
    //Setter methods
    public void setXAxis(int newX) {
        this.x += newX;
    }
    
    public void setYAxis(int newY) {
        this.y += newY;
    }
    
    public void setZAxis(int newZ) {
        this.z += newZ;
    }
    
    public void setSize(int newHeight, int newWidth, int newLength) {
        this.height += newHeight;
        this.width += newWidth;
        this.length += newLength;
    }
    
    public void setType(String newType) {
        this.type = newType;
    }
    
    public void setHP(int newHP) {
        this.hp = newHP;
    }
            
    //Other methods
    public void noise() {
        System.out.println("Noise");
    }
    
    /**
     *
     * @return
     */
    public String toString() {
        String ret = "x: " + this.x + " y: " + this.y + " z: " + 
                    this.z + "\nHeight: " + this.height + " Width:" +
                    this.width + " Length: " + this.length +"\nHP: "
                    + this.hp + " Type: " + this.type;
        return ret;
    }
    
    public void die() {
        System.out.println(this.type + " died");
    }
}
