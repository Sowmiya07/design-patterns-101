package patterns.state;

public class ErrorState implements IState {

    public static final String NAME = "ERROR";
    private final Context context;

    public ErrorState(Context context) {
        this.context = context;
    }

    @Override
    public void onExecute() {
        System.out.printf("onExecute not applicable in %s state%n", NAME);
    }

    @Override
    public void onFailure() {
        System.out.printf("onFailure not applicable in %s state%n", NAME);
    }

    @Override
    public void onRetry() {
        this.context.changeState(new FetchingState(this.context));
        System.out.printf("Moving from %s to %s%n", NAME, FetchingState.NAME);
    }

    @Override
    public void onSuccess() {
        System.out.printf("onSuccess not applicable in %s state%n", NAME);
    }

    @Override
    public String toString() {
        return "Current State " + NAME;
    }
}
