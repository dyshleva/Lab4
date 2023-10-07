package kick;

import lotr.Character;

public class CryKick implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        System.out.println("😢");
    }
}
