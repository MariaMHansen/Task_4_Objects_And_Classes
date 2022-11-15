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
                    "          Try to ... \n" +
                    "          If you need some examples of if statement syntax try: \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          chapter 3.3 if Statements\n" +
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
                    "          Try to ... \n" +
                    "          If you need some examples of if statement syntax try: \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          chapter 3.3 if Statements\n" +
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
                    " The attacks attribute in Player class must be a String Array \n" +
                    "          Try to ... \n" +
                    "          If you need some examples of if statement syntax try: \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          chapter 3.3 if Statements\n" +
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
        // Feedback if ...
        Dragon dragon = new Dragon();
        Player player = new Player("Test");
        dragon.attack(player);
        Assertions.assertEquals(2, player.life);
        Assertions.assertEquals(6, dragon.life);
    }
    // Step 3 Test
    @DisplayName("checks player attacks")
    @Test
    void playerAttacksTest() {
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

        //Test Game 2 where player always wins
        Player p2 = new Player("Test");
        Dragon d2 = new Dragon();
        d2.life=1;
        Game game2 = new Game(p2, d2);

        assertEquals("Dragon won the game!", game1.play());
        assertEquals("Player won the game!", game2.play());
    }

    @DisplayName("checks if sayHello method returns String hello world")
    @Test
    void Should_ReturnHelloWorld() {
        Assertions.assertEquals("hello world!", ObjectsPractice.sayHello());
    }

}