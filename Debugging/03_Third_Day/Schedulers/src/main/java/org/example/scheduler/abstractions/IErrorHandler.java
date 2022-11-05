package org.example.scheduler.abstractions;

@FunctionalInterface
public interface IErrorHandler {
  void handle(Throwable ex);
}
