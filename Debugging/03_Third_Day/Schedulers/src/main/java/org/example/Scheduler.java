package org.example;

import org.example.scheduler.abstractions.ICompletedHandler;
import org.example.scheduler.abstractions.IErrorHandler;
import org.example.scheduler.abstractions.IProvideNextExecutionTime;
import org.example.scheduler.abstractions.IRunNotSafeAction;

import java.util.HashMap;
import java.util.Map;

public class Scheduler {
    private static Scheduler instance;

    private Scheduler() {
    }

    public static Scheduler getInstance() {
        if (instance == null) {
            instance = new Scheduler();
        }

        return instance;
    }

    private IRunNotSafeAction action;
    private IProvideNextExecutionTime executionTimeProvider;
    private IErrorHandler onErrorHandler;
    private ICompletedHandler onSingleActionCompleted;
    private ICompletedHandler onCompleted;

    private Map<Task, Boolean> tasks = new HashMap<>();

    public Scheduler forAction(IRunNotSafeAction action) {
        this.action = action;
        return this;
    }

    public Scheduler useExecutionTimeProvider(IProvideNextExecutionTime executionTimeProvider) {
        this.executionTimeProvider = executionTimeProvider;
        return this;
    }

    public Scheduler onError(IErrorHandler onErrorHandler) {
        this.onErrorHandler = onErrorHandler;
        return this;
    }

    public Scheduler onSingleActionCompleted(ICompletedHandler onSingleActionCompleted) {
        this.onSingleActionCompleted = onSingleActionCompleted;
        return this;
    }

    public Scheduler onCompleted(ICompletedHandler onCompleted) {
        this.onCompleted = onCompleted;
        return this;
    }

    public void Schedule() {
        Task task = new Task();
        task.setAction(this.action);
        task.setExecutionTimeProvider(this.executionTimeProvider);
        task.setOnErrorHandler(this.onErrorHandler);
        task.setOnSingleActionCompleted(this.onSingleActionCompleted);
        task.setOnCompleted(this.onCompleted);

        this.tasks.put(task, false);
    }

    public Map<Task, Boolean> getTasks() {
        return tasks;
    }
}
