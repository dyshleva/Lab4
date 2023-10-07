package kick;

import lotr.Character;

public interface KickStrategy {
    void kick(Character whoKick, Character whoISKicked);
}
