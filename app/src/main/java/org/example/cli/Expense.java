package org.example.cli;

import org.example.service.Add;

import picocli.CommandLine.Command;

@Command(name = "expense", subcommands = { Add.class })
public class Expense implements Runnable {

  @Override
  public void run() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'run'");
  }

}
