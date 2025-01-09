package patterns.strategy;

public class UpperCaseTransformStrategy implements TransformStrategy {
    @Override
    public String transform(String text) {
        return text.toUpperCase();
    }
}
