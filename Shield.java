public class Shield extends Character{
    
    private String n;

    //default constructor initiating instance vars declared in superclass
    public Shield(){
	health = 160;
	strength = 60;
	defense = 80;
	attack = 0.2;
    }

    //overloaded constructor
    public Shield(String n){
	this();
	name = n;
    }
}
