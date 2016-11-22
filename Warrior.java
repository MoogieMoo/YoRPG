public class Warrior extends Character{
    
    private String n;

    //default constructor initiating instance vars declared in superclass
    public Warrior(){
	health = 125;
	strength = 100;
	defense = 40;
	attack = 0.4;
    }

    //overloaded constructor
    public Warrior(String n){
	this();
	name = n;
    }
}
