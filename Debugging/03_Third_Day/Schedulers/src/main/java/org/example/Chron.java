package org.example;


import org.example.scheduler.abstractions.IProvideNextExecutionTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class Chron {
    private LocalDateTime startTime = LocalDateTime.now();
    private LocalDateTime endDate;
    private int maxExecutionTimes = 0;
    private Duration intervalDuration = Duration.ofSeconds(1);

    private int currentExecutionTime = 0;

    private Chron() {
    }

    public Chron setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    public Chron setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    public Chron setMaxExecutionTimes(int maxExecutionTimes) {
        this.maxExecutionTimes = maxExecutionTimes;
        return this;
    }

    public Chron setIntervalDuration(Duration intervalDuration) {
        this.intervalDuration = intervalDuration;
        return this;
    }

    public IProvideNextExecutionTime<LocalDateTime> buildNextTimeExecutionProvider() {
        return () -> {
            if (this.currentExecutionTime >= this.maxExecutionTimes) {
                return null;
            }
            LocalDateTime nextTime = this.startTime.plus(this.intervalDuration.multipliedBy(this.currentExecutionTime));
            if (this.endDate != null && nextTime.isAfter(this.endDate)) {
                return null;
            }

            this.currentExecutionTime++;
            return nextTime;
        };
    }

    public static Chron builder() {
        return new Chron();
    }
}

