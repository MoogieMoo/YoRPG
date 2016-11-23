/*
Dimitriy Leksanov
APCS1 pd1
HW30 -- Ye Olde Role Playing Game
2016-11-16
*/
public class Warrior extends Character{
      /*                                                                          
constructor                                                                     
preconds: takes a class with uninitiated attributes, as well as a name in string for                             
postconds: all attributes are now initiated                                     
    */
    public Warrior(String naming){
	name = naming;
	health = 125;
	strength = 100;
	defense = 40;
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

    public static String about(){
        String retVal = "";
        retVal += "Class: " + getClass() + "\n";
        retVal += "Name: " + getName() + "\n";
        retVal += "Defense: " + getDefense() + "\n";
        return retVal;
    }
}
