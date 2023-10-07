package lotr;

import kick.KnightKingKick;
import java.util.Random;

public class KnightKing extends Character {
    private static Random rand = new Random();

    public KnightKing(int lowerbound) {
        super(lowerbound + rand.nextInt(10), lowerbound + rand.nextInt(10), new KnightKingKick());
    }

}
