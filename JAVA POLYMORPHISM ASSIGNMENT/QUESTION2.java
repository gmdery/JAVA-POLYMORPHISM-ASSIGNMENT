
class Monster {
	
	String name;
		
	Monster(String name) {
	   this.name = name;
	  }
	 public String attack() {
		   return "&^%!*$? I do not know how to attack!";
	   }
	   }
	
class FireMonster extends Monster {
   FireMonster(String name) {
			   super(name);
		}
  public String attack() {
	  return "Attack with fire";
		   }
 }
class WaterMonster extends Monster {
  WaterMonster(String name) {
		   super(name);
		   }
 public String attack() {
     return "Attack with water!";
	   }
	   
	   }
class StoneMonster extends Monster {
 public StoneMonster(String name) {
			   super(name);
	 }
  public String attack() {
   return "Attack with stones!";
		   }
	   }  
 class TestMonster {
    public static void main(String[] args) {
		
   Monster x = new FireMonster("L1R2"); 
   Monster y = new WaterMonster("R2L2");  
   Monster z = new StoneMonster("R1L2");  
  
   System.out.println(x.attack());
   System.out.println(y.attack()); 
   System.out.println(z.attack()); 
	   
   Monster m = new Monster("R2L2");
   System.out.println(m.attack()); 
	
	   }
	   }





