package lotr;

// import java.lang.reflect.Array;
// import org.reflections.Reflections;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import lombok.SneakyThrows;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        // Reflections reflections=new Reflections(prefix:"lotr");
        // Set<Class<? extends Character>>
        // characterSet=reflections.getSubTypesOf(Character);
        List<Class<? extends Character>> characters = Arrays.asList(Hobbit.class, King.class, Knight.class, Elf.class);
        return characters.get(new Random().nextInt(characters.size())).newInstance();
    }

}
