import java.util.*;
/**
* Class to generate the terrain every time the user moves
* @author Jonathan Peters
* @date 2021-11-27
*/

public class WorldBuilder {
    
    public WorldBuilder(){ //Allows you to make an instance of the class
    }
    
    //Methods to do something
    public static String generateTerrain(Character c1) {
        //Creating instances of blocks that can be used to generate terrain
        PlacedBlock[] blocks;
        PlacedBlock[] createdBlocks = new PlacedBlock[4]; 
        createdBlocks = PlacedBlock.makeBlocks();
        
        //Making a 3 by 3 grid for the world
        PlacedBlock[][] generatedBlocks = new PlacedBlock[3][3];
        Random rn = new Random(); //Random number generator 
        int answer;
        
        //For loop to get a random number and get a block based on that number
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                answer = rn.nextInt(4);
                //Adding the random block to the grid
                generatedBlocks[i][j] = createdBlocks[answer]; 
            }  
        }
        
        String world = "";
        
        //Printing the users coordinates
        world += "Your coordinates: " + c1.getX() + " " + c1.getY() + " " + c1.getZ() + "(You are in the middle)\n";
        
        //for loop to make the actual output from the type of blocks that were randomly generated
        for (int i = 0; i < 3; i++) { //Could make a second for loop to make it make a larger terrain
            world += generatedBlocks[i][0].getType() + "|" + generatedBlocks[i][1].getType() + "|" + generatedBlocks[i][2].getType() + "\n";
            world += "----------------\n";
        } 

        return world;
    }

}
