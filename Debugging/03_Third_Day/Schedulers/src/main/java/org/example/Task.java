package org.example;

import org.example.scheduler.abstractions.ICompletedHandler;
import org.example.scheduler.abstractions.IErrorHandler;
import org.example.scheduler.abstractions.IProvideNextExecutionTime;
import org.example.scheduler.abstractions.IRunNotSafeAction;

import java.time.LocalDateTime;

public class Task {
    public IRunNotSafeAction getAction() {
        return action;
    }

    public void setAction(IRunNotSafeAction action) {
        this.action = action;
    }

    public IProvideNextExecutionTime<LocalDateTime> getExecutionTimeProvider() {
        return executionTimeProvider;
    }

    public void setExecutionTimeProvider(IProvideNextExecutionTime<LocalDateTime> executionTimeProvider) {
        this.executionTimeProvider = executionTimeProvider;
    }

    public IErrorHandler getOnErrorHandler() {
        return onErrorHandler;
    }

    public void setOnErrorHandler(IErrorHandler onErrorHandler) {
        this.onErrorHandler = onErrorHandler;
    }

    public ICompletedHandler getOnSingleActionCompleted() {
        return onSingleActionCompleted;
    }

    public void setOnSingleActionCompleted(ICompletedHandler onSingleActionCompleted) {
        this.onSingleActionCompleted = onSingleActionCompleted;
    }

    public ICompletedHandler getOnCompleted() {
        return onCompleted;
    }

    public void setOnCompleted(ICompletedHandler onCompleted) {
        this.onCompleted = onCompleted;
    }

    private IRunNotSafeAction action;
    private IProvideNextExecutionTime executionTimeProvider;
    private IErrorHandler onErrorHandler;
    private ICompletedHandler onSingleActionCompleted;
    private ICompletedHandler onCompleted;

    /**
     * @return is finished
     */
    public boolean executeTask() {
        LocalDateTime currentStepTime = getExecutionTimeProvider().provideTime();
        if (currentStepTime == null) {
            getOnCompleted().call();
            return true;
        }

        if (LocalDateTime.now().isAfter(currentStepTime)) {
            try {
                getAction().executeNotSafeAction();
                getOnSingleActionCompleted().call();
            } catch (Exception e) {
                getOnErrorHandler().handle(e);
            }
        }
        return false;
    }
}
