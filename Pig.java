public class Pig extends FriendlyMob {
   
   public Pig(int x, int y, int z, int hp, int height, int width, int length, String type, boolean friendly, String drop, int dropAmount) {
      super(x, y, z, hp, height, width, length, type, friendly, drop, dropAmount); 
   } 
   
   //Methosd to do something
   public void noise() {
      System.out.println("Oink");
   }
   
}