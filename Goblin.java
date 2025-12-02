public class Goblin {
    int health;
    int damage;
    public Goblin(int h, int d){
        health = h;
        damage = d;
    }
//Needs constructor
    void gobGobble(){
        System.out.println("The goblin Gobbles");
    }
    //needs method to overwrite attack in enemy to say "the goblin gobbles" instead of "the enemy attacks
}
