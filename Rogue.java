public class Rogue extends Character{
    
    private String n;

    //default constructor initiating instance vars declared in superclass
    public Rogue(){
	health = 100;
	strength = 125;
	defense = 45;
	attack = 0.65;
    }

    //overloaded constructor
    public Rogue(String n){
	this();
	name = n;
    }
}
