public class BigDog extends Character{
    public BigDog(String naming){
	name = naming;
	health = 150;
	strength = 125;
	defense = 30;
	attack = 0.4;
    }

    //specialize() overriden
    public void specialize(){
	attack *= 2.0;
	defense /= 2.0;
    }
    public void normalize(){
        attack /= 2.0;
        defense *= 2.0;
    }

    public String about(){
        String retVal = "";
	retVal += "Class: " + getClass() + "\n";
	retVal += "Name: " + getName() + "\n";
	retVal += "Defense: " + getDefense() + "\n";
	return retVal;
    }
}
