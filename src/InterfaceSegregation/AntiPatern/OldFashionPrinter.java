package InterfaceSegregation.AntiPatern;

import jdk.jshell.spi.ExecutionControl;

// This is where we violate the Interface Segregation Princple.
// This printer can print a document but cannot fax or scan any document.
// By implementing Machine interface we are forcing this client to implements the methods that it's not capable of.
public class OldFashionPrinter implements Machine {
  @Override
  public void print(Document d) {
    // Can print
  }

  @Override
  public void scan(Document d) throws ExecutionControl.NotImplementedException {
    // Cannot scan, it should be either empty or throws not implemented Exception.
    throw new ExecutionControl.NotImplementedException("Scan is not supported in this machine.");
  }

  @Override
  public void fax(Document d) throws ExecutionControl.NotImplementedException {
    // Cannot fax, it should be either empty or throws not implemented Exception.
    throw new ExecutionControl.NotImplementedException("Fax is not supported in this machine.");
  }
}
