/**
* This is the Character class. This class extends the Moving things class and is the  base for your playable character
*
* @author Jonathan Peters
* @date Nov 25, 2021
*/

import java.util.*;

public class Character extends MovingThing {
    private double hunger;
    private double armor;
    private int inventoryMarker;
    private double healthRegen;
    private String username;
   
    boolean isCrouch = false;


    public Character(int x, int y, int z, int hp, int height, int width, int length, String type, double hunger, double armor, int inventoryMarker, double healthRegen, String username) {
        super(x, y, z, hp, height, width, length, type);
        this.hunger = hunger;
        this.armor = armor;
        this.inventoryMarker = inventoryMarker;
        this.healthRegen = healthRegen; 
        this.username = username;
    } 
        
    //Getters
    public double getHunger() {
        return this.hunger;
    }

    public double getArmor() {
        return this.armor;
    }

    public double getHealthRegen() {
        return this.healthRegen;
    }

    public String getUsername() {
        return this.username;
    }
    
    //Getting all of the generated items from the item class and returning them
    public String[] getInventory() {
        Item[] inventory = new Item[3];
        inventory = Item.generateInventory();
        
        String[] itemNames = new String[3];
        
        for (int i = 0; i < inventory.length; i++) {
            itemNames[i] = inventory[i].getType();
        }
        
        return itemNames;
        
    }

    //This allows the user to specify which item they want to use from their inventory
    public int getInventoryMarker() {
        return this.inventoryMarker;
    }
    //Setters
    public void setHunger(double newHunger) {
        this.hunger = newHunger;
    }

    public void setArmor(double newArmor) {
        this.armor = newArmor;
    }

    public void setHealthRegen(double newHealthRegen) {
        this.healthRegen = newHealthRegen;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }
    
    public void setInventoryMarker(int newInventoryMarker) {
        this.inventoryMarker = newInventoryMarker;
    }
    
      //methods that do something
    //Allows the user to crouch
    public void crouch() {
        if (isCrouch == false) {
            this.setSize(-1,0, 0);
            System.out.println("You are now crouching");
            isCrouch = true;
        } else {
            this.setSize(1,0, 0);
            System.out.println("You are no longer crouching");
            isCrouch = false;
        }

    }
      //Ideally, this would be user input but for now it can stay like this where the values are inputted in 
      //the back end
    //Allows the user to move, and every time they move they lose some hunger(static amount)
    public void move(int newX, int newY, int newZ) {
        this.setXAxis(newX);
        this.setYAxis(newY);
        this.setZAxis(newZ);
        this.hunger -= 0.5;
        if (this.hunger == 0) {
            this.die("Hunger");
        } else { //If the user doesnt die, then generate the terrain around the user 
            System.out.println(WorldBuilder.generateTerrain(this));
        }
    }

    //Allowing the user to eat food, but not pass the max amount of fod
    public void eat(double foodValue) {
          if ((this.hunger += foodValue) > 20) {
              this.hunger = 20;
          } else {
              this.hunger += foodValue;
          }  
    }
    
    //Outputting the users held item 
    public void heldItem() {
        Item[] inventory = new Item[3];
        inventory = Item.generateInventory();
        
        System.out.println(inventory[this.inventoryMarker].toString());
    }
    
    //Printing the iventory, but doesnt return it
    public void printInventory() {
      Item[] inventory = new Item[3];
      inventory = Item.generateInventory();

      for (int i = 0; i < 3; i++) {
        System.out.println(inventory[i].toString());
      }
    }

    //Returns the characters stats
    public String toString() {
        String ret = "x: " + this.getX() + " y: " + this.getY() + " z: " + 
                    this.getZ() + "\nHeight: " + this.getHeight() + " Width:" +
                    this.getWidth() + " Length: " + this.getLength() +"\nHP: "
                    + this.getHp() + "\nType: " + this.getType() + "\nHunger: " + this.hunger + "\nArmor: " + this.armor + "\nInventory Marker: " + this.inventoryMarker + "\nHealth Regen: " + this.healthRegen + "\nUserName: " + this.username;
        return ret;
    }

    //Mine block class
    public void mineBlock(int x, int y, int z) {
        int xDiff = this.getX() - x;
        int yDiff = this.getY() - y;
        
        //Finding the pickPower of the item currently being held
        Item[] inventory = new Item[3];
        inventory = Item.generateInventory();
        double pickPower = inventory[this.inventoryMarker].getPickPower();
        
        //Generating instances of the blocks
        PlacedBlock[] placedBlock;
        placedBlock = PlacedBlock.makeBlocks();

        Random rn = new Random(); //Random number generator to choose random block 
        int answer;
        answer = rn.nextInt(4);
        
        //Seeing if that block is in range, and if it is do the block break method
        if (xDiff > -2 && xDiff < 2) {
            if (yDiff > -2 && yDiff < 2) {
               placedBlock[answer].breakBlock(x, y, pickPower, placedBlock[answer].getDurability(), placedBlock[answer].getItemResist()); //Need to get the pickPower of the itemn being held
               
            }
        }
    }

    //Overridding the die method from moving thing
    public void die(String reason) {
        System.out.println(this.username + " died from " + reason);
        System.exit(0);
    }
}
