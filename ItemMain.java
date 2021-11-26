import java.util.*;

public class ItemMain {
    public static void main (String[] args) {

        String ret = "";
        
        ArrayList<Item> objects = new ArrayList<Item>();
        
        //Creating the objects
        objects.add(new Consumable("Steak", 3, 3));
        objects.add(new WeaponsTools ("Pickaxe", 1, 10, 1, 0));
        
        //List to view the stats of the object/s
        for (int i = 0; i < objects.size(); i++) {
            ret = objects.get(i).toString();
            System.out.println(ret + "\n");
        }

        // Using item

        // Using weapon/tool

    /*
        //Changing the stats of the objects
        for (int i = 0; i < objects.size(); i++) {
            objects.get(i).setXAxis(4);
            objects.get(i).setYAxis(-8);
            objects.get(i).setZAxis(-1);
            objects.get(i).setHP(4);
            objects.get(i).die();
            objects.get(i).setType("New type");
            objects.get(i).noise();
        }
    */
    }
}
