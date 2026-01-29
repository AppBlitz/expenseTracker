package org.example.service;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "add", description = "Add task")
public class Add implements Runnable {

  @Option(names = { "-a" }, paramLabel = "<name >")
  private String name;

  @Override
  public void run() {
    System.out.print(name);
  }

}
