package patterns.state;

public class FetchingState implements IState {

    public static final String NAME = "FETCHING";
    private final Context context;

    public FetchingState(Context context) {
        this.context = context;
    }

    @Override
    public void onFailure() {
        this.context.changeState(new ErrorState(this.context));
        System.out.printf("Moving from %s to %s%n", NAME, ErrorState.NAME);
    }

    @Override
    public void onExecute() {
        System.out.printf("onExecute not applicable in %s state%n", NAME);
    }

    @Override
    public void onRetry() {
        System.out.printf("onRetry not applicable in %s state%n", NAME);
    }

    @Override
    public void onSuccess() {
        this.context.changeState(new IdleState(this.context));
        System.out.printf("Moving from %s to %s%n", NAME, IdleState.NAME);
    }

    @Override
    public String toString() {
        return "Current State " + NAME;
    }
}
