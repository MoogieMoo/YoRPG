public class Sorcerer extends Character{
    public Sorcerer(String naming){
	name = naming;
	health = 125;
	strength = 85;
	defense = 35;
	attack = 0.4;
    }

    //specialize() overriden
    public void specialize(){
	attack *= 1.5;
	defense /= 1.2;
    }
    public void normalize(){
        attack /= 1.5;
        defense *= 1.2;
    }

    public static String about(){
        String retVal = "";
	retVal += "Class: " + getClass() + "\n";
	retVal += "Name: " + getName() + "\n";
	retVal += "Defense: " + getDefense() + "\n";
	return retVal;
    }
}