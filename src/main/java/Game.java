import java.util.Random;

public class Game {
    Player player;
    Dragon dragon;

    public Game(Player player, Dragon dragon) {
        this.player = player;
        this.dragon = dragon;
    }

   public String randomPlayerAttack(){
       Random randomGenerator = new Random();
       int randomAttack=randomGenerator.nextInt(3);

       if(randomAttack==0){
           player.shootArrow(dragon);
           System.out.println(player.attacks[0]);
           return player.attacks[0];

       }
       if(randomAttack==1){
           player.shootFireArrow(dragon);
           System.out.println(player.attacks[1]);
           return player.attacks[1];

       }
       if(randomAttack==2){
           player.useHealingPotion();
           System.out.println(player.attacks[2]);
           return player.attacks[2];

       }

       return null;
   }
   public String play(){
       System.out.println("The game started!");
       System.out.println("Player "+player.name+" attacks the dragon ");
        while (dragon.life>0 && player.life>0){
            randomPlayerAttack();
            System.out.println("Dragon life " + dragon.life);
            if(dragon.life>0){dragon.attack(player);}
            System.out.println("Player life " + player.life);
        }
       if(dragon.life>0){
           return "Dragon won the game!";

       } else if(player.life>0){
           return "Player won the game!";
       }
       return null;
   }
}
