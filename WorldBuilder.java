import java.util.*;

public class WorldBuilder {
    int[] blockLocationX = new int[9];
    int[] blockLocationY = new int[9];
    
    public WorldBuilder(){
    }
    
    //Methods to do something
    //Need to make the terrain generate actual blocks no just strings
    public static String generateTerrain(Character c1) {
        PlacedBlock[] blocks;
        PlacedBlock[] createdBlocks = new PlacedBlock[4]; 
        createdBlocks = PlacedBlock.makeBlocks();
        
        
        PlacedBlock[][] generatedBlocks = new PlacedBlock[3][3];
        Random rn = new Random();
        int answer;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                answer = rn.nextInt(4);
                generatedBlocks[i][j] = createdBlocks[answer];
            }  
        }
        
        String world = "";
        
        world += "Your coordinates: " + c1.getX() + " " + c1.getY() + " " + c1.getZ() + "(You are in the middle)\n";
        for (int i = 0; i < 3; i++) { //Could make a second for loop to make it make a larger terrain
            world += generatedBlocks[i][0].getType() + "|" + generatedBlocks[i][1].getType() + "|" + generatedBlocks[i][2].getType() + "\n";
            world += "----------------\n";
        }
        
        return world;
    }

}
