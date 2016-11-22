public class Monster extends Character{

    //default constructor initiating instance vars declared in superclass
    public Monster(){
	super();
	health = 150;
	defense = 20;
	attack = 1;
	strength = ((int)(Math.random() * 45) + 20);
    }
	    
}
