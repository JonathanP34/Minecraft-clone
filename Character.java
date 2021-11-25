/**
* This is the Character class. This class extends the Moving things class and is the base for your playable character
*
* @author Jonathan Peters
* @date Nov 25, 2021
*/

public class Character extends MovingThing {
    private double hunger;
    private double armor;
    //private Item[] inventory; <- not yet
    private double healthRegen;
    private String username;
   
    boolean isCrouch = false;


    public Character(int x, int y, int z, int hp, int height, int width, int length, String type, double hunger, double armor, double healthRegen, String username) {
        super(x, y, z, hp, height, width, length, type);
        this.hunger = hunger;
        this.armor = armor;
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
            String terrain = "";
            terrain = worldBuilder.generateTerrain(this);
            System.out.println(terrain);  
        }
    }

    public void eat(double foodValue) {
        if ((this.hunger += foodValue) > 10) {
            this.hunger = 10;
        }
      }
}
