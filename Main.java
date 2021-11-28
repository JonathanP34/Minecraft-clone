/**
 * @date 2021-11-27
 * @author Jonathan Peters
 * Main class to test all of the methods
 */
public class Main {
    public static void main(String[] args) {
        String terrain = "";
        Item[] inventory = new Item[3];
        inventory = Item.generateInventory();
        
        //Creating new instances of the item, character and block class
        Character c1 = new Character(0, 0, 0, 100, 2, 1, 1, "Character", 10.0, 0.0, 0, 1.0, "Steve");
        Item item = new Item("Bucket", 1, 2, 2, 0, 100);
        PlacedBlock block = new PlacedBlock("Stone", 0, 0, 0, 50, 2);

        //Testing character related methods
        c1.crouch();
        c1.crouch();
        System.out.println("");

        //Testing item related methods
        item.lowerDurability();
        item.getDurability();
        item.removeConsumable();
        item.getNumItem();
        System.out.println();

        //Testing block related methods
        System.out.println(block.getDurability());
        block.setDurability(110);
        System.out.println(block.getItemResist());
        System.out.println();

        //Testing mineing and inventory methods
        c1.mineBlock(1, 1, 0);
        c1.setInventoryMarker(1);
        System.out.println("");
        c1.printInventory();
        System.out.println("");

        //Testing character methods again
        System.out.println(c1.toString());
        System.out.println("");
        c1.eat(inventory[c1.getInventoryMarker()].getHungerChange());

        //Testing moving and world builder methods
        for (int i = 0; i < 20; i++) {
            c1.move(1, 3, 0);
            if (c1.getHunger() == 1) {
              c1.eat(inventory[2].getHungerChange());
              System.out.println(c1.getHunger());
            }
        }
        
        //Killing the character
        c1.die("Boredom");
            
    }
}

