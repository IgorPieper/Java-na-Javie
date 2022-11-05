package org.example;

import java.util.Map;

public class SchedulerThread implements Runnable {

    @Override
    public void run() {
        while (!launchTasks(Scheduler.getInstance().getTasks())) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private boolean launchTasks(Map<Task, Boolean> tasks) {
        boolean allFinished = true;
        for (Map.Entry<Task, Boolean> task : tasks.entrySet()) {
            Boolean finished = task.getValue();
            if (!finished) {
                finished = task.getKey().executeTask();
                task.setValue(finished);
            }

            allFinished = allFinished && finished;
        }

        return allFinished;
    }
}
