public class Creeper extends HostileMob {

   public FriendlyMob(int x, int y, int z, int hp, int height, int width, int length, String type, boolean friendly, String drop, int dropAmount, boolean scared) {
      super(x, y, z, hp, height, width, length, type, friendly, drop, dropAmount) 
   }
    
   //Methods that do something
   public void noise() {
      System.out.println("Hiss");
   }
   
   public void explode() {
      System.out.println("EXPLODE");
      this.die("Explosion");
      
   }
   
}