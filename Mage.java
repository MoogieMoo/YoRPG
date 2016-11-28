public class Mage extends Character{
    /*
      Constructor
      preconds: takes a class with uninitiated attribute, as well as a String for name
      postconds: all attributes now initiated
     */
    public Mage(String naming){
	name = naming;
	health = 200;
	strength = 75;
	defense = 45;
	attack = 0.4;
    }
    public void specialize(){
        attack *= 1.2;
        defense /= 1.2;
    }

    public void normalize(){
        attack /= 1.2;
        defense *= 1.2;
    }

    public String about(){
        String retVal = "";
	retVal += "Class: " + getClass() + "\n";
	retVal += "Name: " + getName() + "\n";
	retVal += "Defense: " + getDefense() + "\n";
	return retVal;
    }
}
