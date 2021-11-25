/**
* This is the PlacedBlock class. This class is the base for all the blocks in our version of Minecraft
*
* @author Jonathan Petrs
* @date Nov 25, 2021
*/

public class PlacedBlock {
    private String type;
   private int x;
   private int y;
   private int z;
   private double durability;
   private double itemResist;
   //private drop Item;
   
   public PlacedBlock(String type, int x, int y, int z, double durability, double itemResist) {
      this.type = type;
      this.x = x;
      this.y = y;
      this.z = z;
      this.durability = durability;
      this.itemResist = itemResist;
   }
   
   //Getters
   public String getType() {
      return this.type;
   }
   
   public int getX() {
      return this.x;
   }
   
   public int getY() {
      return this.y;
   }
   
   public int getZ() {
      return this.z;
   }
   
   public double getDurability() {
      return this.durability;
   }
   
   public double getItemResist() {
      return this.itemResist;
   }
   
   //Setters
   public void setDurability(double newDurability) {
      this.durability -= newDurability;
      if (this.durability < 0) {
         System.out.println("Block destroyed");
      }
   }
   
   public void setLocation(int newX, int newY, int newZ) {
       this.x = newX;
       this.y = newY;
       this.z = newZ;
   }
   
   public void setType(String newType) {
       this.type = newType;
   }
   
   //Methods that do something
}
