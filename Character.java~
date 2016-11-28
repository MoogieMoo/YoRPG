/*
Dimitriy Leksanov, Kelly, Maggie - Group LlamaGoats
APCS1 pd1
HW34 -- YoRPGv4
2016-11-17
 */


public abstract class Character{
    protected int health;
    protected int strength;
    protected int defense;
    protected double attack;
    protected String name;
    //these variables should be passed on due to the permission

    /*                                                                         \
                                                                                
boolean isAlive()                                                              \
                                                                                
preconds: none                                                                 \
                                                                                
postconds: if health reaches zero, returns false (dead); else, returns true (al\
\                                                                               
ive)                                                                           \
                                                                                
    */

    public boolean isAlive(){
	return (health > 0);
    }

    /*
      String getName()
      preconds: Character has a name attribute with a value
      postconds: returns a String with the value of name
     */
    public String getName(){
	return name;
    }

    /*                                                                          
      int getDefense()                                                          
      preconds: used to get the defense attribute of another Object             
      postconds: returns said defense attribute                                 
    */
    public int getDefense(){
	return defense;
    }

    /*                                                                         \
                                                                                
      lowerHP(int)                                                             \
                                                                                
      preconds: takes an int that represents how much damage is to be done     \
                                                                                
      postconds: health decreases by the value of the "damage" input value     \
                                                                                
    */
    public void lowerHP(int damage){
	health -= damage;
    } 

    /*                                                                          
      int attack(Character)                                                       
      preconds: takes an opposing Character and uses is defense attribute as well\
 as the method lowerHP to determine the damage done to it                       
      postconds: returns the amount of damage done as an int; this is used in d\
isplays                                                                         
    */

    public int attack(Character c){
	int damage = 0;
	int def = c.getDefense();
	damage += (strength * attack);
	damage -= def;
	if (damage < 0){
	    damage = 0;
	}
	c.lowerHP(damage);
	return damage;
    }

    /*                                                                          
      specialize()                                                              
      preconds: preps for a special (feeling lucky) attack                      
      postconds: attack is multiplied by 1.2, defense divided by 1.2 temporaril\
y                                                                               
    */
    //the method is now abstract for it to be easily overridden
    public abstract void specialize();
       
    /*                                                                          
      normalize()                                                               
      preconds: preps for normal (unlucky) attack                               
      postconds: returns stats to normal-- reverse effects of specialize()      
    */
    public abstract void normalize();

    /*
      static String about
      preconds: takes a Character
      postconds: returns the name and values of the Character's attributes in a string
     */
    public abstract static String about();
}
