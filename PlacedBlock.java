/**
* This is the PlacedBlock class. This class is the base for all the blocks in our version of Minecraft
*
* @author Jonathan Peters
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
   public void setPlace(int newX, int newY, int newZ) {
      this.x = newX;
      this.y = newY;
      this.z = newZ;
   }
   
   public void setDurability(double newDurability) {
      this.durability -= newDurability;
      if (this.durability < 0) {
         System.out.println("Block destroyed");
      }
   }
   
   public void setType(String newType) {
      this.type = newType;
   }
   
   public static PlacedBlock[] makeBlocks() {
      PlacedBlock[] blocks = new PlacedBlock[4];
      blocks[0] = new PlacedBlock("Dirt", 0, 0, 0, 2, 2);
      blocks[1] = new PlacedBlock("Stone", 0, 0, 0, 5, 3);
      blocks[2] = new PlacedBlock("Iron", 0, 0, 0, 8, 5);
      blocks[3] = new PlacedBlock("Sand", 0, 0, 0, 1, 0);
      
      return blocks;
   }
   
   //Make a block.break method
   
   
}


