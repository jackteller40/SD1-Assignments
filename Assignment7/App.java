public class App {
    public static void main(String[] args) throws Exception {
        Enemy Enemy1 = new Enemy(100, 50);
        Enemy1.attack();
        Wizard Wizard1 = new Wizard(200, 60, "fire");
        Wizard Wizard2 = new Wizard(180, 55, "ice");
        Wizard1.damageType();
        Wizard2.damageType();
        Goblin Goblin1 = new Goblin(120, 30);
        Goblin1.gobGobble();
        //create a generic enemy and call its functions

        //create a fire and an ice wizard and call all functions

        //create a goblin and call its functions
    }
}
