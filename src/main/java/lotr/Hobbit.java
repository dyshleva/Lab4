package lotr;

import kick.CryKick;

public class Hobbit extends Character {
    public Hobbit() {
        super(3, 0, new CryKick());
    }

    @Override
    public void kick(Character c) {
        System.out.println("😭");
    }

}
