package patterns.strategy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeTransformStrategy implements TransformStrategy {
    @Override
    public String transform(String text) {
        return Arrays.stream(text.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
    }
}
