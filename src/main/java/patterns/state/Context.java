package patterns.state;

public class Context {

    private IState currentState;

    Context() {
        this.currentState = new IdleState(this);
    }

    void changeState(IState newState) {
        this.currentState = newState;
    }

    void getCurrentState() {
        System.out.println(this.currentState);
    }

    void onExecute() {
        this.currentState.onExecute();
    }

    void onFailure() {
        this.currentState.onFailure();
    }

    void onSuccess() {
        this.currentState.onSuccess();
    }

    void onRetry() {
        this.currentState.onRetry();
    }
}
