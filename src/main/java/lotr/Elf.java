package lotr;

import kick.ElfKick;

public class Elf extends Character {
    public Elf() {
        super(10, 10, new ElfKick());
        // which kick to implement? cry Kick norm?
    }

    @Override
    public void kick(Character whoIsKicked) {
        if (whoIsKicked.getPower() < this.getPower()) {
            whoIsKicked.setHp(0);
        } else {
            whoIsKicked.setPower(whoIsKicked.getPower() - 1);
        }
    }
}
