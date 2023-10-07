package lotr;

public class GameManager {

    public static void fight(Character c1, Character c2) {
        int roundnumb = 0;
        String c1name = c1.getClass().getSimpleName();
        String c2name = c2.getClass().getSimpleName();

        System.out.println("The game between " + c1name + " and " +
                c2name + " has started\n");
        info(c1, c2);

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("Round " + ++roundnumb);

            c1.kick(c2);
            if (c2.isAlive()) {
                c2.kick(c1);
                info(c1, c2);
            } else {
                System.out.println("First player (" + c1name + ") has won the fight");
            }

            if (!c1.isAlive()) {
                System.out.println("Second player (" + c2name + ") has won the fight");
            }

        }
    }

    public static void info(Character c1, Character c2) {
        System.out
                .println("\nInformation about " + c1.getClass().getSimpleName() + "\n hp: " + c1.getHp() + "\n power: "
                        + c1.getPower());
        System.out.println("Information about " + c2.getClass().getSimpleName() + "\n hp: " + c2.getHp() + "\n power: "
                + c2.getPower() + "\n");
    }

    public static boolean hobbitFight(Character c1, Character c2) {
        if (c1.getClass().getSimpleName().equals("Hobbit") && c2.getClass().getSimpleName().equals("Hobbit")) {
            System.out.println("Hobbits cannot fight against each other");
            return false;
        } else if (c1.getClass().getSimpleName().equals("Elf") && c2.getClass().getSimpleName().equals("Elf")) {
            System.out.println("Elfs cannot fight against each other");
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        boolean canFight = hobbitFight(c1, c2);

        if (canFight == true) {
            fight(c1, c2);
        }

    }
}
