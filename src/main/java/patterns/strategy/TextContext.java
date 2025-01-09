package patterns.strategy;

public class TextContext {

    private String text;
    private TransformStrategy transformStrategy;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTransformStrategy(TransformStrategy transformStrategy) {
        this.transformStrategy = transformStrategy;
    }

    public void transform() {
        this.text = this.transformStrategy.transform(this.text);
    }
}
