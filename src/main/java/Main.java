import com.magicworld.fight.Fight;
import com.magicworld.player.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Fight fight = new Fight();
        player.selectGrade();
        fight.startFight();
    }
}
