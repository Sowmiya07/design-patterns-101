package patterns.state;

public class IdleState implements IState {

    public static final String NAME = "IDLE";
    private final Context context;

    public IdleState(Context context) {
        this.context = context;
    }

    @Override
    public void onExecute() {
        this.context.changeState(new FetchingState(this.context));
        System.out.printf("Moving from %s to %s%n", NAME, FetchingState.NAME);
    }

    @Override
    public void onFailure() {
        System.out.printf("onFailure not applicable in %s state%n", NAME);
    }

    @Override
    public void onRetry() {
        System.out.printf("onRetry not applicable in %s state%n", NAME);
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
