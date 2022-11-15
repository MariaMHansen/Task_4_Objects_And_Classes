public class Player {
    String name;
    int life;
    String [] attacks;


   // constructor
    public Player(String name) {
        this.name = name;
        this.life = 3;
        this.attacks = new String[]{"Player shoots an Arrow","Player shoots a Fire Arrow","Player uses Healing Potion"};
    }

    public void shootArrow(Dragon dragon){
        dragon.life=dragon.life-1;
    }
    public void shootFireArrow(Dragon dragon){
        dragon.life=dragon.life-3;
    }
    public void useHealingPotion(){
        life=life+1;
    }
}
