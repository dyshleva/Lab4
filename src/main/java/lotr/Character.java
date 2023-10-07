package lotr;

import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kickStrategy;

    public void kick(Character whoIsKicked) {
        kickStrategy.kick(this, whoIsKicked);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        // if (hp >= 0) {
        // this.hp = hp;
        // }
        // this.hp = 0;
        this.hp = hp > 0 ? hp : 0;
    }

    public int getHp() {
        return this.hp;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
