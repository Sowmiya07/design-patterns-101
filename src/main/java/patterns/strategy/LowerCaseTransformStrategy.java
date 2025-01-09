package patterns.strategy;

public class LowerCaseTransformStrategy implements TransformStrategy {
    @Override
    public String transform(String text) {
        return text.toLowerCase();
    }
}
