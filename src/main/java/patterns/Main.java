package patterns;

import patterns.strategy.CapitalizeTransformStrategy;
import patterns.strategy.LowerCaseTransformStrategy;
import patterns.strategy.TextContext;
import patterns.strategy.UpperCaseTransformStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Strategy
//        Used when family of algorithms chosen to used by the client at runtime & algorithms added without any change at client end
//        Use composition over inheritance
//        Supports open-close principle
//        Collections.sort() - take different Comparator strategy to sort the Collection

        TextContext textContext = new TextContext();
        textContext.setText("text of string");

        System.out.println("Before transformation: " + textContext.getText());

        textContext.setTransformStrategy(new UpperCaseTransformStrategy());
        textContext.transform();
        System.out.println("Upper Case Transformation: " + textContext.getText());

        textContext.setTransformStrategy(new LowerCaseTransformStrategy());
        textContext.transform();
        System.out.println("Lower Case Transformation: " + textContext.getText());

        textContext.setTransformStrategy(new CapitalizeTransformStrategy());
        textContext.transform();
        System.out.println("Capitalize Transformation: " + textContext.getText());
    }
}