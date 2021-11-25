package minecraft;

import java.util.*;
public class MainMovingThing {
    public static void main(String[] args) {
        String ret = "";
        
        ArrayList<MovingThing> objects = new ArrayList<MovingThing>();
        
        //Creating the objects
        objects.add(new MovingThing(0, 0, 0, 100, 1, 1, 1, "Spider"));
        objects.add(new MovingThing(10, -5, 7, 75, 1, 1, 2, "Horse"));
        
        //List to see the stats of the objects
        for (int i = 0; i < objects.size(); i++) {
            ret = objects.get(i).toString();
            System.out.println(ret + "\n");
        }
        
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
        
        for (int i = 0; i < objects.size(); i++) {
            ret = objects.get(i).toString();
            System.out.println(ret + "\n");
        }
    }
}
