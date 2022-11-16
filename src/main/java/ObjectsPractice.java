import java.util.Arrays;
    /*
       Welcome to assignment four,
       Where you will practice with using objects and classes.
       In this task you will not only need to make the methods,
       like in the previous tasks, but also create classes and objects.

       ------------------------------------------------------------
       Classes and Objects
       -------------------------------------------------------------
       Object-oriented programming (OOP) involves programming using objects to represent things
       in the real world, for example a cat. The state of the object is represented by attributes,
       the cat has 1 toy mouse, 1 bowl of milk. The behavior of an object is defined by methods in the class,-
       for example the cat can eat and sleep. The class can be used to make unique objects, we can use the cat class
       to make Tom cat or to make Garfield cat, which are two unique cats.

       In this exercise, you will practice using objects and classes to make an adventure mini-game.
       Scroll down to STEP 1:
       */


/**
 * This is the Main method,
 * Uncomment the lines of code for each method you implement
 * to test your solution
 */
public class ObjectsPractice {
    public static void main(String[] args) {
        ObjectsPractice op = new ObjectsPractice();
        System.out.print("Step 1: "); op.getPlayerInfo(new Player("Bob"));
        System.out.print("Step 2: "); op.dragonAttackTester();
        System.out.print("Step 3: "); op.playerAttackTester();
        System.out.println("Step 4: "+ op.gameAttackTester());
        System.out.print("Step 5: " + op.playGameTester());
    }

    /**
     * Task 1
     * Create a Player class, with name, life and skills attributes.
     * The Player needs a name of your choice, 3 lives and an array of his skills
     * which must be exactly the following:
     * "Player Shoots an Arrow","Player Shoots a Fire Arrow","Player Uses Healing Potion"
     * See the UML diagram for this class to implement it correctly,
     * you can find it in the main directory of the project in the UML folder (double click to open the png)
     * We will only implement the Player class from the diagram in this step.
     * Uncomment the getPlayerInfo method to test the solution
     * You can read more about implementing UML diagrams as code in:
     * "Introduction to Java Programming and Data Structures book" 9.2 Defining Classes for Objects
     */


    public void getPlayerInfo(Player player){
        System.out.print("Player " +player.name);
       System.out.print(" life "   +player.life);
        System.out.println(" skills " +Arrays.toString(player.attacks));
    }


    /**
     * Task 2
     * Create a Dragon class, the dragon needs to have 6 lives
     * Create a method for the dragon, that allows him to attack the player
     * Each time the method is called player loses one life.
     * Use the UML diagram to implement the Dragon class correctly
     * Uncomment the method below to test the solution.
     */


    public void dragonAttackTester(){
        Dragon dragon = new Dragon();
        Player player2 = new Player("Tom");
        dragon.attack(player2);
        System.out.println("Players life is now "+ player2.life);
    }



    /**
     * Task 3
     * Create the following methods the player can attack the dragon with
     *  Methods
     *     using an arrow decreases dragon life by 1
     *     using an arrow decreases dragon life by 3
     *     using an arrow decreases dragon life by 1
     *     Uncomment the method below to test the solution.
     *     Use the UML diagram Game class as reference.
     *     Tip! You can use the player attacks array to print out players actions
     *     on the screen to make it more fun to debug potential problems.
     */


    public void playerAttackTester(){
        Player player = new Player("Sam");
        Dragon dragon = new Dragon();
        player.shootArrow(dragon);
        System.out.print("Dragon life reduces to " +dragon.life);
        player.shootFireArrow(dragon);
        System.out.print(" dragon life reduces to " +dragon.life);
        player.useHealingPotion();
        System.out.println(" player life increases to " +player.life);
    }


    /**
     * Task 4
     * Implement the following functionality in the game class:
     * The Player uses a random skill, the dragon attacks back
     * The method must return the name of the attack from the player's attack list
     * See examples of using random in 9.6.2 The Random Class
     * Tip! You can use the player attacks array to print out players actions
     *      on the screen to make it more fun to debug potential problems.
     */


    public String gameAttackTester(){
        Player player = new Player("Tom");
        Dragon dragon = new Dragon();
        Game game = new Game(player, dragon);
        String attack = game.randomPlayerAttack();
        return attack;
    }


    /**
     * Task 5
     * Implement the following functionality in the game class
     * The player keeps using a random attack
     * and the dragon keeps attacking back after each attack,
     * as long as both player and dragon are alive
     * If one of them gets to 0 or below lives the game announces the winner.
     * Player shoots first. Dragon can not shoot back if he has 0 lives.
     * Make some print statements for dragon and player life
     * to keep track of the damage in the game.
     * Return Strings must be exactly these: "Dragon won the game!", "Player won the game!".
     * Use the UML diagram to implement the associations relations classes correctly
     */


   public String playGameTester(){
       Player player = new Player("Tom");
       Dragon dragon = new Dragon();
       Game game = new Game(player, dragon);
       String winner =game.play();
       return winner;
   }

}