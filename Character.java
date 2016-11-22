public class Character {
    
    //instance vars shared by all classes and monsters
    protected String name;
    protected int health;
    protected int strength;
    protected int defense;
    protected double attack;
    private int countSpecial;

    //default constructor
    public Character() {
	health = 125;
	strength = 100;
	defense = 40;
	attack = 0.4;
    }

    //accessor
    public String getName(){
	return name;
    }
    
    //accessor
    public int getDefense(){
	return defense;
    }

    //accessor
    public int getHealth(){
	if (health < 0){
	    health = 0;
	}
	return health;
    }

    //true if character is alive
    public boolean isAlive(){
	return (health > 0);
    }

    //lowers health by damage
    public void lowerHP(int damage){
	health -= damage;
    }

    public int attack(Character c){
	int damage = 0;
	int def = c.getDefense();
	damage += (strength * attack);
	damage -= def;
	if (damage < 0) {
	    damage = 0;
	}
	c.lowerHP(damage);
	return damage;
    }

    public void specialize(){
	attack *= 1.2;
	defense /= 1.2;
    }


    public void normalize(){
	    attack /= 1.2;
	    defense *= 1.2;
    }

    public static String about() {
	return ("Warrior: " +
	        "\n\thealth = 125" +
	        "\tstrength = 100" +
	        "\tdefense = 40" +
	        "\tattack = 40" +
	        "\nMage: " +
	        "\n\thealth = 100" +
	        "\tstrength = 90" +
	        "\tdefense = 60" +
	        "\tattack = 80" +
	        "\nRogue: " +
	        "\n\thealth = 100" +
	        "\tstrength = 125" +
	        "\tdefense = 45" +
	        "\tattack = 65" +
	        "\nShield: " +
	        "\n\thealth = 160" +
	        "\tstrength = 60" +
	        "\tdefense = 80" +
	        "\tattack = 20" );
    }
}
