/**
 * Testing/making terrain
 */
package minecraft;

/**
 *
 * @author Jonathan Peters
 */
public class terrainTester {
    public static void main(String[] args) {
        String terrain = "";
        Item[] inventory = new Item[3];
        inventory = Item.generateInventory();
        
        Character c1 = new Character(0, 0, 0, 100, 1, 1, 1, "Character", 10.0, 0.0, 0, 1.0, "Steve");
        
        c1.mineBlock(1, 1, 0);
        for (int i = 0; i < 2; i++) {
            c1.move(1, 3, 0);
        }
        
        
            
    }
}
