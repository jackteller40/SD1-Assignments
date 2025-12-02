public class Wizard extends  Enemy{
    int health;
    int damage;
    String type;
    public Wizard(int h, int d, String t) {
        super(h, d);
        type = t;
    }
    void damageType(){
        if (type == "fire"){
            System.out.println("This wizard shoots a fireball");
        }
        else if (type == "ice"){
            System.out.println("This wizard shoots an iceball");
        }else{
            System.out.println("This is not a valid type of Wizard");
        }
    
        

        //if the type of wizard is 'fire', then print "this wizard shoots a fireball"
        //if the type is 'ice', then print "this wizard shoots an iceball"
    }

}
