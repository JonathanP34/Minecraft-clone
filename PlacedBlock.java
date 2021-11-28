import java.lang.Thread;
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
      if (this.durability < 0) { //If the blocks breaks
         System.out.println("Block destroyed");
      }
   }
   
   public void setType(String newType) {
      this.type = newType;
   }
   
   //Allows the user to generate a list of possible blocks to help with the world class
   public static PlacedBlock[] makeBlocks() {
      PlacedBlock[] blocks = new PlacedBlock[4]; //List of blocks that is returned
      blocks[0] = new PlacedBlock("Dirt", 0, 0, 0, 30, 1);
      blocks[1] = new PlacedBlock("Stone", 0, 0, 0, 75, 3);
      blocks[2] = new PlacedBlock("Iron", 0, 0, 0, 100, 5);
      blocks[3] = new PlacedBlock("Sand", 0, 0, 0, 30, 0);
      
      return blocks;
   }
   
   //Breaking the specified block
   public void breakBlock(int x, int y, double pickPower, double durability, double itemResist) {
       double powerDiff;
       //Making the lowest possible valyue for item resist 1
       if (pickPower-itemResist <= 0) {
          powerDiff = 1;
       } else {
          powerDiff = (pickPower - itemResist);
       }
       //Calculating the number of hits required to mine the block
       double timeToMine = durability / (powerDiff);

       //Outputting the number of hits with Dink and putting the code to sleep for 1 second between each hit
       for(int i = 0; i < Math.round(timeToMine); i++) {
           try {
                System.out.println("Dink");
                Thread.sleep(1000);
           } catch (Exception e) {
               System.out.println("Error");
           }
       }
       //Outputting which block was mined and how long it took
       System.out.println("The block at x:" + x + " and y:" + y + " was mined!");
       System.out.println("It took " + Math.round(timeToMine) + " hit(s) to mine the block!");
   } 
   
}
