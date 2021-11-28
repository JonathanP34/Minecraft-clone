/**
* This is the Character class. This class extends the Moving things class and is the base for your playable character
*
* @author Jonathan Peters
* @date Nov 25, 2021
*/

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
    
    public String[] getInventory() {
        Item[] inventory = new Item[3];
        inventory = Item.generateInventory();
        
        String[] itemNames = new String[3];
        
        for (int i = 0; i < inventory.length; i++) {
            itemNames[i] = inventory[i].getType();
        }
        
        return itemNames;
        
    }

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
    public void move(int newX, int newY, int newZ) {
        this.setXAxis(newX);
        this.setYAxis(newY);
        this.setZAxis(newZ);
        this.hunger -= 0.5;
        if (this.hunger == 0) {
            this.die("Hunger");
        } else {
            System.out.println(WorldBuilder.generateTerrain(this));
        }
    }

    public void eat(double foodValue) {
          if ((this.hunger += foodValue) > 20) {
              this.hunger = 20;
          } else {
              this.hunger += foodValue;
          }  
    }
      
    public void heldItem() {
        Item[] inventory = new Item[3];
        inventory = Item.generateInventory();
        
        System.out.println(inventory[this.inventoryMarker].toString());
    }
    
    public void printInventory() {
      Item[] inventory = new Item[3];
      inventory = Item.generateInventory();

      for (int i = 0; i < 3; i++) {
        System.out.println(inventory[i].toString());
      }
    }

    public String toString() {
        String ret = "x: " + this.getX() + " y: " + this.getY() + " z: " + 
                    this.getZ() + "\nHeight: " + this.getHeight() + " Width:" +
                    this.getWidth() + " Length: " + this.getLength() +"\nHP: "
                    + this.getHp() + "\nType: " + this.getType() + "\nHunger: " + this.hunger + "\nArmor: " + this.armor + "\nInventory Marker: " + this.inventoryMarker + "\nHealth Regen: " + this.healthRegen + "\nUserName: " + this.username;
        return ret;
    }

    public void mineBlock(int x, int y, int z) {
        int xDiff = this.getX() - x;
        int yDiff = this.getY() - y;
        
        //Finding the pickPower of the item currently being held
        Item[] inventory = new Item[3];
        inventory = Item.generateInventory();
        double pickPower = inventory[this.inventoryMarker].getPickPower();
        
        PlacedBlock placedBlock;
        placedBlock = new PlacedBlock("NA", 0, 0, 0, 100, 2);

        if (xDiff > -2 && xDiff < 2) {
            if (yDiff > -2 && yDiff < 2) {
               placedBlock.breakBlock(x, y, pickPower, placedBlock.getDurability(), placedBlock.getItemResist()); //Need to get the pickPower of the itemn being held
               
            }
        }
    }
}
