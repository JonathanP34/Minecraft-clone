/**
 * Testing/making terrain
 */
/**
 *
 * @author Jonathan Peters
 */
public class Main {
    public static void main(String[] args) {
        String terrain = "";
        Item[] inventory = new Item[3];
        inventory = Item.generateInventory();
        
        Character c1 = new Character(0, 0, 0, 100, 1, 1, 1, "Character", 10.0, 0.0, 0, 1.0, "Steve");
        
        c1.mineBlock(1, 1, 0);
        c1.setInventoryMarker(1);
        System.out.println("");

        c1.printInventory();
        System.out.println("");

        System.out.println(c1.toString());
        System.out.println("");
        c1.eat(inventory[c1.getInventoryMarker()].getHungerChange());
        for (int i = 0; i < 20; i++) {
            c1.move(1, 3, 0);
            if (c1.getHunger() == 1) {
              c1.eat(inventory[2].getHungerChange());
              System.out.println(c1.getHunger());
            }
        }
        
        c1.die("Boredom");
            
    }
}
