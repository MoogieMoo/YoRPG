public class Rogue extends Character{
    public Rogue(String naming){
	name = naming;
	health = 75;
	strength = 200;
	defense = 30;
	attack = 0.6;
    }
    public void specialize(){
        attack *= 1.2;
        defense /= 1.2;
    }

    public void normalize(){
        attack /= 1.2;
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