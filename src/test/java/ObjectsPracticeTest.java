import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.lang.model.type.ArrayType;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ObjectsPracticeTest {
    ObjectsPracticeTest() {
    }
    // Step 1 Test
    @DisplayName("checks player attributes")
    @Test
    void playerAttributesTest() {
         Player p1 = new Player("Test");

        // Checking if attribute name type is a String
        Object object1 = p1.name;
        if (!(object1 instanceof String)) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " The name attribute in Player class must be a String \n" +
                    "          It looks like your Player name data type is not String \n" +
                    "          To see an example of creating classes and attributes, try \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          9.3 Example: Defining Classes and Creating Objects \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Checking if attribute life type is an int
        Object object2 = p1.life;
        if (!(object2 instanceof Integer)) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " The life attribute in Player class must be an integer \n" +
                    "          It looks like your Player life data type is not integer\n" +
                    "          To see an example of creating classes and attributes, try \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          9.3 Example: Defining Classes and Creating Objects \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Checking if attribute skills array is a String[]
        Object [] attacks = p1.attacks;
        Object object3 = attacks[1];
        if (!(object3 instanceof String)) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    "          It looks like your Player attacks array type is not String [] \n" +
                    "          You can find an example of creating a String array in\n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          7.2.6 Processing Arrays \n" +
                    "          There is a months array example at the end of the chapter\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        Assertions.assertEquals("Test", p1.name);
        Assertions.assertEquals(3, p1.life);
        String [] expected = new String[]{"Player shoots an Arrow","Player shoots a Fire Arrow","Player uses Healing Potion"};
        Assertions.assertArrayEquals(expected, p1.attacks);



    }
    // Step 2 Test
    @DisplayName("checks dragon class methods and attributed")
    @Test

    void dragonClassTest() {
        Dragon dragon1 = new Dragon();
        // Checking if attribute life is an int
        Object object = dragon1.life;
        if (!(object instanceof Integer)) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " The life attribute in Dragon class must be an integer \n" +
                    "          To see an example of creating classes and attributes, try \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          9.3 Example: Defining Classes and Creating Objects \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        // Testing if the attack methods work
        Dragon dragon = new Dragon();
        Player player = new Player("Test");
        dragon.attack(player);
        if (player.life==3) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " It looks like the attack method in Dragon class did not reduce player life \n" +
                    "          Did you remember to call the dragon.attack(player) method? \n" +
                    "          To read more about calling methods try \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          6.3 Calling a Method\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        Assertions.assertEquals(2, player.life);
        Assertions.assertEquals(6, dragon.life);
    }
    // Step 3 Test
    @DisplayName("checks player attacks")
    @Test
    void playerAttacksTest() {
        // Checking if player attacks work
        Player p1 = new Player("Test");
        Dragon d1 = new Dragon();
        p1.shootArrow(d1);
        // Checking if Player class arrow attack works
        if (d1.life==6) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " It looks like the shootArrow method in Player class did not reduce dragon life \n" +
                    "          Make sure that the method includes a statement \n" +
                    "          player.life = player.life - 1 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        // Checking if Player class fire arrow attack works
        Player p2= new Player("Test");
        Dragon d2 = new Dragon();
        p2.shootFireArrow(d2);
        if (d2.life==5) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " It looks like the shootFireArrow method in Player class only \n" +
                    " Reduced the dragon's life by 1, it is supposed to do a \n" +
                    " Damage of 3 points, check the task description again \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Checking if Player class healing potion skill works
        Player p3= new Player("Test");
        p3.useHealingPotion();
        if (p3.life==3) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " It looks like the useHealingPotion method in Player class \n" +
                    " Does not increase player life by 1 \n" +
                    " It is possible that you have increased the dragon's life instead \n" +
                    " Make sure the method includes a statement \n" +
                    " player.life = player.life + 1 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Asserts for the unit tests
        Player player = new Player("Test");
        Dragon dragon = new Dragon();
        player.shootArrow(dragon);
        Assertions.assertEquals(5, dragon.life);
        player.shootFireArrow(dragon);
        Assertions.assertEquals(2, dragon.life);
        player.useHealingPotion();
        Assertions.assertEquals(4, player.life);
    }
    // Step 4 Test
    @DisplayName("checks random attack generator in game")
    @Test
    void gameAttacksTest() {
        // Testing random attacks
        Player player = new Player("Tom");
        Dragon dragon = new Dragon();
        Game game = new Game(player, dragon);
        // Feedback in case the randomPlayerAttack method returns void
        Object object = game.randomPlayerAttack();
        if (!(object instanceof String)) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " The randomPlayer Attack method must return a String \n" +
                    "          Does your method return void?\n" +
                    "          Check task description and the UML diagram\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        String [] expectedResults = new String[]{"Player shoots an Arrow","Player shoots a Fire Arrow","Player uses Healing Potion"};
        List<String> expectedResultsList = Arrays.asList(expectedResults);
        assertTrue(expectedResultsList.contains((game.randomPlayerAttack())));


    }
    // Step 5 Test
    @DisplayName("checks if the game returns correct winner")
    @Test
    void gameWinnerTest() {
        //Test Game 1 where dragon always wins
        Player p1 = new Player("Test");
        p1.life=1;
        Dragon d1 = new Dragon();
        Game game1 = new Game(p1, d1);
        // Feedback in case player always wins the game
        if (game1.play().equals("Player won the game!")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " It looks like the Player always wins in your game \n" +
                    "          Check if player.life is deducted by dragon attacks\n" +
                    "          in your game loop, try to make some print \n" +
                    "          statements to keep check if attacks affect life \n" +
                    "          make sure that you call the dragon.attack(player) method \n" +
                    "          in your game while loop \n" +
                    "          To read more about calling methods try \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          6.3 Calling a Method\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        //Test Game 2 where player always wins
        Player p2 = new Player("Test");
        Dragon d2 = new Dragon();
        d2.life=1;
        Game game2 = new Game(p2, d2);
      // Feedback in case player always wins the game
        if (game2.play().equals("Dragon won the game!")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " It looks like the Dragon always wins in your game \n" +
                    "          Check if dragon.life is deducted by player attacks\n" +
                    "          in your game loop, try to make some print \n" +
                    "          statements to keep check if attacks affect life \n" +
                    "          make sure that you call the dragon.attack(player) method \n" +
                    "          in your game while loop \n" +
                    "          To read more about calling methods try \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          6.3 Calling a Method\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        assertEquals("Dragon won the game!", game1.play());
        assertEquals("Player won the game!", game2.play());
    }
}