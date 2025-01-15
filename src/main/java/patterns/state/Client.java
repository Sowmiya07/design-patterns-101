package patterns.state;

public class Client {

    public static void main(String[] args) {

        Context context = new Context();
        context.getCurrentState();

        context.onExecute();
        context.onFailure();
        context.onRetry();
        context.onSuccess();


        Context context1 = new Context();
        context1.getCurrentState();
        context1.onSuccess();
        context1.onExecute();
        context1.onSuccess();
    }

}
