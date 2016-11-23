/*                                                                              
Dimitriy Leksanov with Kelly and Maggie - Team LlamaGoats                                                               
APCS1 pd1                                                                       
HW32 -- Ye Olde Role Playing Game, Version 3                                               
2016-11-20                                                                      
*/
public class Monster extends Character{
    /*
constructor
preconds: takes a class with uninitiated attributes
postconds: all attributes are now initiated
    */
    public Monster(){
	name = "Big Man Over Here";
	health = 150;
	defense = 20;
	attack = 1;
	strength = (int) ((Math.random() * 45) + 20);
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
