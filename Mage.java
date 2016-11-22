public class Mage extends Character{
    
    private String n;

    //default constructor initiating instance vars declared in superclass
    public Mage(){
	health = 100;
	strength = 90;
	defense = 60;
	attack = 0.8;
    }

    //overloaded constructor
    public Mage(String n){
	this();
	name = n;
    }
}
