package kick;

import java.util.Random;

import lotr.Character;

public class KnightKingKick implements KickStrategy {

    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        Random rand = new Random();
        whoIsKicked.setHp(whoIsKicked.getHp() - rand.nextInt(whoKick.getPower()));

    }
}
