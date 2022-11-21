import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ObjectsPracticeTest {
    ObjectsPracticeTest() {
    }
    // Step 1 Test
    @DisplayName("Checks player attributes")
    @Test
    void playerAttributesTest() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Checking if Player class exists
        if (!classExists("Player")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " You need to create the Player class to pass Test 1 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Checking if Player name attribute exists
        if (!fieldExists("Player", "name")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " You need to create the Player name attribute to pass Test 1 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Checking if Player life attribute exists
        if (!fieldExists("Player", "life")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " You need to create the Player life attribute to pass Test 1 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Checking if Player attacks attribute exists
        if (!fieldExists("Player", "attacks")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " You need to create the Player attacks attribute to pass Test 1 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        else {
            // Creating a new Player object and checking if it has a String attribute name
            Object testPlayerObject = createPlayerTestObject();
            Field nameField = getFieldFromClass("Player", testPlayerObject, "name");
            Object nameValue = nameField.get(testPlayerObject);
            // Feedback if Player attribute name is not string
            if (!(nameValue instanceof String)) {
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
            //Checking if Player class has an integer attribute life
            Field lifeField = getFieldFromClass("Player", testPlayerObject, "life");
            Object lifeValue = lifeField.get(testPlayerObject);
            // Feedback if Player attribute name is not string
            if (!(lifeValue instanceof Integer)) {
                fail("\n" +
                        "-------------------------------------------------------------------------\n" +
                        "AUTO-FEEDBACK:\n" +
                        "Step 1:\n" +
                        " The life attribute in Player class must be an integer \n" +
                        "          It looks like your Player life data type is not integer \n" +
                        "          To see an example of creating classes and attributes, try \n" +
                        "          \"Introduction to Java Programming and Data Structures book\"\n" +
                        "          9.3 Example: Defining Classes and Creating Objects \n" +
                        "-------------------------------------------------------------------------\n"
                );
            }
            // Checking if Player Class attribute skills array is a String[]
            Field attacksField = getFieldFromClass("Player", testPlayerObject, "attacks");
            Object attacksValue = attacksField.get(testPlayerObject);
            // Checking if the first element in the attacks array is a String
            String [] attacks = (String[]) attacksValue;

             if (!(attacks[0] instanceof String)) {
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
            Assertions.assertEquals(true, nameValue instanceof String);
            Assertions.assertEquals(true, lifeValue instanceof Integer);
            String [] expected = new String[]{"Player shoots an Arrow","Player shoots a Fire Arrow","Player uses Healing Potion"};
            Assertions.assertArrayEquals(expected, attacks);
        }
    }


    // Step 2 Test
    @DisplayName("Checks dragon class methods and attributes")
    @Test
    void dragonClassTest() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Checking if Dragon class exists
        if (!classExists("Dragon")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 2:\n" +
                    " You need to create the Dragon class to pass Test 2 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Checking if Dragon class life attribute exists
        if (!fieldExists("Dragon", "life")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " You need to create the Dragon life attribute to pass Test 2 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        else {
            // Creating a new Dragon object and checking if it has an integer attribute life
            Object testDragonObject = createDragonTestObject();
            Field lifeField = getFieldFromClass("Dragon", testDragonObject, "life");
            Object lifeValue = lifeField.get(testDragonObject);
            // Feedback if Dragon attribute life is not integer
            if (!(lifeValue instanceof Integer)) {
                fail("\n" +
                        "-------------------------------------------------------------------------\n" +
                        "AUTO-FEEDBACK:\n" +
                        "Step 1:\n" +
                        " The life attribute in Dragon class must be an integer \n" +
                        "          It looks like your Dragon life data type is not integer \n" +
                        "          To see an example of creating classes and attributes, try \n" +
                        "          \"Introduction to Java Programming and Data Structures book\"\n" +
                        "          9.3 Example: Defining Classes and Creating Objects \n" +
                        "-------------------------------------------------------------------------\n"
                );
            }
            if (!(classExists("Player"))||(!fieldExists("Player","life"))) {
                fail("\n" +
                        "-------------------------------------------------------------------------\n" +
                        "AUTO-FEEDBACK:\n" +
                        "Step 2:\n" +
                        " You need to create the Player class with a life attribute to pass Test 2 \n" +
                        "-------------------------------------------------------------------------\n"
                );
            }
            if (!(attackMethodExists())) {
                fail("\n" +
                        "-------------------------------------------------------------------------\n" +
                        "AUTO-FEEDBACK:\n" +
                        "Step 2:\n" +
                        " You need to create the attack method in Dragon class to pass  Test 2 \n" +
                        "-------------------------------------------------------------------------\n"
                );
            }

            // Checking Dragon attack method to check if it deducts 1 from player life
            // Make a player object here
            int changedPlayerLife = callDragonAttackMethod();
            // Feedback if Player life is still 3 and did not decrease after the Dragon attack
            if (changedPlayerLife==3) {
                fail("\n" +
                        "-------------------------------------------------------------------------\n" +
                        "AUTO-FEEDBACK:\n" +
                        "Step 2:\n" +
                        " The attack method in Dragon Class had no effect on Player life\n" +
                        "          Make sure to include a player.life -=1 statement in your method \n" +
                        "          To see an example of creating classes and attributes, try \n" +
                        "          \"Introduction to Java Programming and Data Structures book\"\n" +
                        "            Introduction to Methods chapter 6.1 Introduction \n" +
                        "-------------------------------------------------------------------------\n"
                );
            }
            // Assertions only run if classes and fields exist
            Assertions.assertEquals(2, changedPlayerLife);
            Assertions.assertEquals(6, lifeValue);
        }
    }


    // Step 3 Test
    @DisplayName("Checks player attacks")
    @Test
    void playerAttacksTest() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        //Checking that player methods exist before the test
        if (!(shootArrowMethodExists())||(!shootFireArrowMethodExists())||(!useHealingPotionMethodExists())) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    "You need to create 3 methods in Player class to pass this test\n" +
                    "shootArrow, shootFireArrow and useHealingPotion\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        int[] testAttackResults;

        testAttackResults = callPlayerAttackMethods();
        int dragonLifeAfterArrowAttack = testAttackResults[0];
        int dragonLifeAfterFireArrowAttack = testAttackResults[1];
        int playerLifeAfterHealingPotion = testAttackResults[2];

        // Checking if Player class arrow attack works
        if (dragonLifeAfterArrowAttack==6) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " It looks like the shootArrow method in Player class did not reduce dragon life \n" +
                    "          Make sure that the method includes a statement \n" +
                    "          player.life = player.life - 1 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        // Checking if Player class fire arrow attack works
        if (dragonLifeAfterFireArrowAttack==5) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " It looks like the shootFireArrow method in Player class only \n" +
                    " Reduced the dragon's life by 1, it is supposed to do a \n" +
                    " Damage of 3 points, check the task description again \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Checking if Player class healing potion skill works
        if (playerLifeAfterHealingPotion==3) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " It looks like the useHealingPotion method in Player class \n" +
                    " Does not increase player life by 1 \n" +
                    " It is possible that you have increased the dragon's life instead \n" +
                    " Make sure the method includes a statement \n" +
                    " player.life = player.life + 1 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        Assertions.assertEquals(5, dragonLifeAfterArrowAttack);
        Assertions.assertEquals(2, dragonLifeAfterFireArrowAttack);
        Assertions.assertEquals(4, playerLifeAfterHealingPotion);
    }



    // Step 4 Test
    @DisplayName("Checks random attack generator in game")
    @Test
    void gameAttacksTest() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
       
        Object randomAttackResult = callGameRandomAttack();

        if (!(randomAttackResult instanceof String)) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " The random Player Attack method must return a String \n" +
                    "          Does your method return void?\n" +
                    "          Check task description and the UML diagram\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        if (!(classExists("Game"))||!(classExists("Player"))||!(classExists("Dragon"))) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " You need to create the Player, Game and Dragon classes to pass Test 4 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        if (!(randomAttackMethodExists())) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 2:\n" +
                    " You need to create the random attack method in Game class to pass  Test 4 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        String [] expectedResults = new String[]{"Player shoots an Arrow","Player shoots a Fire Arrow","Player uses Healing Potion"};
        List<String> expectedResultsList = Arrays.asList(expectedResults);
        assertTrue(expectedResultsList.contains((randomAttackResult.toString())));


    }


    // Step 5 Test
    @DisplayName("Checks if the game returns correct winner")
    @Test
    void gameWinnerTest() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        if (!(classExists("Game"))||!(classExists("Player"))||!(classExists("Dragon"))) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 5:\n" +
                    " You need to create the Player, Game and Dragon classes to pass Test 5 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        if (!(playMethodExists())||(!fieldExists("Player","life"))||(!fieldExists("Dragon","life"))) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 5:\n" +
                    " You need to create the play method in Game class to pass Test 5 \n" +
                    " You will also need Player and Dragon life fields \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

      //Test Game 1 where dragon always wins
        Object playResult1 = callGamePlay("Player");
        String winnerDragon = (String)playResult1;
        // Feedback in case player always wins the game
        if (winnerDragon.equals("Player won the game!")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 5:\n" +
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
        Object playResult2 = callGamePlay("Dragon");
        String winnerPlayer = (String)playResult2;
      // Feedback in case player always wins the game
        if (winnerPlayer.equals("Dragon won the game!")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 5:\n" +
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
        //assertEquals("Dragon won the game!", game1.play());
        //assertEquals("Player won the game!", game2.play());
    }
    public boolean classExists (String className)
    {
        try { Class.forName (className); return true;
        }
        catch (ClassNotFoundException exception) { return false;
        }
    }

    public boolean fieldExists (String className, String fieldName)
    {
        try {
            Class<?> TempClass = Class.forName(className);
            Field field = TempClass.getDeclaredField(fieldName); return true;
        } catch (ClassNotFoundException e) {
            return false;
        }  catch (NoSuchFieldException e) {
            return false;
        }
    }

    public boolean attackMethodExists ()
    {
        try {
            Class<?> DragonClass = Class.forName("Dragon");
            Class<?> PlayerClass = Class.forName("Player");
            Method attackMethod = DragonClass.getMethod("attack", PlayerClass); return true;
        } catch (ClassNotFoundException e) {
            return false;
        }  catch (NoSuchMethodException e) {
            return false;
        }
    }
    public boolean shootArrowMethodExists ()
    {
        try {
            Class<?> DragonClass = Class.forName("Dragon");
            Class<?> PlayerClass = Class.forName("Player");
            Method shootArrowMethod = PlayerClass.getMethod("shootArrow", DragonClass); return true;
        } catch (ClassNotFoundException e) {
            return false;
        }  catch (NoSuchMethodException e) {
            return false;
        }
    }
    public boolean shootFireArrowMethodExists ()
    {
        try {
            Class<?> DragonClass = Class.forName("Dragon");
            Class<?> PlayerClass = Class.forName("Player");
            Method shootFireArrowMethod = PlayerClass.getMethod("shootFireArrow", DragonClass); return true;
        } catch (ClassNotFoundException e) {
            return false;
        }  catch (NoSuchMethodException e) {
            return false;
        }
    }
    public boolean useHealingPotionMethodExists ()
    {
        try {
            Class<?> DragonClass = Class.forName("Dragon");
            Class<?> PlayerClass = Class.forName("Player");
            Method useHealingPotionMethod = PlayerClass.getMethod("useHealingPotion"); return true;
        } catch (ClassNotFoundException e) {
            return false;
        }  catch (NoSuchMethodException e) {
            return false;
        }
    }

    public boolean randomAttackMethodExists ()
    {
        try {
            Class<?> GameClass = Class.forName("Game");
            Method randomPlayerAttack = GameClass.getMethod("randomPlayerAttack"); return true;
        } catch (ClassNotFoundException e) {
            return false;
        }  catch (NoSuchMethodException e) {
            return false;
        }
    }

    public boolean playMethodExists ()
    {
        try {
            Class<?> GameClass = Class.forName("Game");
            Method playMethod = GameClass.getMethod("play"); return true;
        } catch (ClassNotFoundException e) {
            return false;
        }  catch (NoSuchMethodException e) {
            return false;
        }
    }


    /**
     * Method for creating a new Player instance without using the Player class, because it needs to compile before the class is created.
     * @return
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     *  @author Maria Hansen
     */
    private Object createPlayerTestObject() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // If Player class exists check if the name attribute is a String
        Class<?> TempClass = Class.forName("Player");
        // getting Player class constructor
        Constructor<?> constructor = TempClass.getConstructor(String.class);
        // Object array for the constructor attributes
        Object [] arguments = new Object[1];
        arguments[0] = "PlayerTestName";
        // Instantiating Player object
        Object instance = constructor.newInstance(arguments);
        return instance;
    }

    /**
     * Method for creating a new Dragon instance without using the Dragon class, because it needs to compile before the class is created.
     * @return
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     *  @author Maria Hansen
     */
    private Object createDragonTestObject() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // If Dragon class exists check if the name attribute is a String
        Class<?> TempClass = Class.forName("Dragon");
        // getting Player class constructor
        Constructor<?> constructor = TempClass.getConstructor();
        // Instantiating Dragon object
        Object instance = constructor.newInstance();
        return instance;
    }


    /**
     * Method for getting a field from a class, compiles before the class is created
     * @param className
     * @param testObject
     * @param attributeName
     * @return
     * @author Maria Hansen
     */
    private Field getFieldFromClass(String className, Object testObject, String attributeName) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> TempClass = Class.forName(className);
        Field field = TempClass.getDeclaredField(attributeName);
        field.setAccessible(true);
        return field;
    }
    /**
     * Method checking if Player life is decreased after a dragon attack
     * Could not reuse create methods for Dragon and Player due to field access and Class<?> ID issues
     * @author Maria Hansen
     */
    private int callDragonAttackMethod() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        // Making a new dragon object
        int decreasedPlayerLife = -1;
        Class<?> DragonClass = Class.forName("Dragon");
        Constructor<?> constructor = DragonClass.getConstructor();
        Object dragonObject = constructor.newInstance();

         try {
             // Making a new player object
             Class<?> PlayerClass = Class.forName("Player");
             Method attackMethod = DragonClass.getMethod("attack", PlayerClass);

             // Making a Player instance to invoke attack method can not use createPlayer method, causes Class ID mismatch

             Constructor<?> playerConstructor = PlayerClass.getConstructor(String.class);
            // Object array for the constructor attributes
            Object [] arguments = new Object[1];
            arguments[0] = "PlayerTestName";
            // Instantiating Player object
            Object playerObject = playerConstructor.newInstance(arguments);

            // Make player life field accessible
            Field playerLifeField = PlayerClass.getDeclaredField("life");
            playerLifeField.setAccessible(true);

            // Invoke the attack method
            Object result4 = attackMethod.invoke(dragonObject, playerObject);
            Object pLife = playerLifeField.get(playerObject);
            decreasedPlayerLife =(int)pLife;

        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        } catch (NoSuchFieldException e) { throw new RuntimeException(e); }

        return decreasedPlayerLife;
    }

    private Object callGameRandomAttack() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object randomAttackResult = null;

        // Making a new dragon object
        int decreasedPlayerLife = -1;
        Class<?> DragonClass = Class.forName("Dragon");
        Constructor<?> dragonConstructor = DragonClass.getConstructor();
        Object dragonObject = dragonConstructor.newInstance();

        // Making a new player object
        Class<?> PlayerClass = Class.forName("Player");
        Constructor<?> playerConstructor = PlayerClass.getConstructor(String.class);
        // Object array for the constructor attributes
        Object [] arguments = new Object[1];
        arguments[0] = "PlayerTestName";
        // Instantiating Player object
        Object playerObject = playerConstructor.newInstance(arguments);

        // Making a new game object
        Class<?> GameClass = Class.forName("Game");
        Constructor<?> gameConstructor = GameClass.getConstructor(PlayerClass, DragonClass);
        Object gameObject = gameConstructor.newInstance(playerObject, dragonObject);

        try {
            Method randomAttackMethod = GameClass.getMethod("randomPlayerAttack");
            randomAttackResult = randomAttackMethod.invoke(gameObject);
           

        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        }
        return randomAttackResult;

    }

    private Object callGamePlay(String loser) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Object playResult = null;

        // Making a new dragon object
        Class<?> DragonClass = Class.forName("Dragon");
        Constructor<?> dragonConstructor = DragonClass.getConstructor();
        Object dragonObject = dragonConstructor.newInstance();

        // Make a dragon life field
        Field dragonLifeField = DragonClass.getDeclaredField("life");
        dragonLifeField.setAccessible(true);

        // Making a new player object
        Class<?> PlayerClass = Class.forName("Player");
        Constructor<?> playerConstructor = PlayerClass.getConstructor(String.class);
        // Object array for the constructor attributes
        Object [] arguments = new Object[1];
        arguments[0] = "PlayerTestName";
        Object playerObject = playerConstructor.newInstance(arguments);

        // Making a player life field
        Field playerLifeField = PlayerClass.getDeclaredField("life");
        playerLifeField.setAccessible(true);

        // Setup one to lose
        if(loser.equals("Player")){
            playerLifeField.set(playerObject,1);
        } else if (loser.equals("Dragon")) {
            dragonLifeField.set(dragonObject,1);
        }

        // Making a new game object
        Class<?> GameClass = Class.forName("Game");
        Constructor<?> gameConstructor = GameClass.getConstructor(PlayerClass, DragonClass);
        Object gameObject = gameConstructor.newInstance(playerObject, dragonObject);




        try {
            Method playMethod = GameClass.getMethod("play");
            playResult = playMethod.invoke(gameObject);


        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        }
        return playResult;

    }
    /**
     * Method checking if Player attacks affect Dragon and Player attributed
     * @author Maria Hansen
     */
    private int[] callPlayerAttackMethods() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        int[] results = new int[3];

        // Make a new Dragon
        // Invoke Arrow attack
        // Get dragon life field and add to array
        // Invoke FireArrow attack
        // Get dragon life field and add to array
        // Invoke HealingPotion
        // Get player life field and add to array

        // Making a new Player class and Object
        int decreasedDragonLife = -1;
        int increasedPlayerLife = -1;

        Class<?> PlayerClass = Class.forName("Player");
        Constructor<?> playerConstructor = PlayerClass.getConstructor(String.class);
        // Object array for the constructor attributes
        Object [] arguments = new Object[1];
        arguments[0] = "PlayerTestName";
        Object playerObject = playerConstructor.newInstance(arguments);


        // Making a new Dragon class and object
        Class<?> DragonClass = Class.forName("Dragon");
        Constructor<?> dragonConstructor = DragonClass.getConstructor();
        Object dragonObject = dragonConstructor.newInstance();
        Method shootArrowMethod = PlayerClass.getMethod("shootArrow", DragonClass);
        Method shootFireArrowMethod = PlayerClass.getMethod("shootFireArrow", DragonClass);
        Method useHealingPotionMethod = PlayerClass.getMethod("useHealingPotion");

        try {
            // Make dragon life field accessible
            Field dragonLifeField = DragonClass.getDeclaredField("life");
            dragonLifeField.setAccessible(true);

            // Make player life field accessible
            Field playerLifeField = PlayerClass.getDeclaredField("life");
            playerLifeField.setAccessible(true);

            // Invoke the Arrow Attack method
            shootArrowMethod.invoke(playerObject, dragonObject);
            Object dragonLifeAfterAttack = dragonLifeField.get(dragonObject);
            decreasedDragonLife =(int)dragonLifeAfterAttack;
            results[0]=decreasedDragonLife;

            // Invoke the Fire Arrow Attack method
            shootFireArrowMethod.invoke(playerObject, dragonObject);
            Object dragonLifeAfterFireAttack = dragonLifeField.get(dragonObject);
            decreasedDragonLife =(int)dragonLifeAfterFireAttack;
            results[1]=decreasedDragonLife;

            // Invoke the Healing Potion method
            useHealingPotionMethod.invoke(playerObject);
            Object playerLifeAfterHealingPotion = playerLifeField.get(playerObject);
            increasedPlayerLife =(int)playerLifeAfterHealingPotion;
            results[2]=increasedPlayerLife;


        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        } catch (NoSuchFieldException e) { throw new RuntimeException(e); }


        return results;
    }

}