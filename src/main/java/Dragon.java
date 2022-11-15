public class Dragon {
    int life;

    public Dragon() { this.life = 6; }

    public void attack (Player player){
    player.life = player.life-1;
        System.out.print("Dragon attacks: ");
    }
}
