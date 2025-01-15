package patterns.state;

public interface IState {
    void onExecute();
    void onFailure();
    void onRetry();
    void onSuccess();
}
