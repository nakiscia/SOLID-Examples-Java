package InterfaceSegregation.AntiPatern;

import jdk.jshell.spi.ExecutionControl;

// A interface for printer and other machines..
// We are violating the InterfaceSegregation by these methods.
// Segregation means seperate behaviors into categories.
public interface Machine {
  void print(Document d);
  void scan(Document d) throws ExecutionControl.NotImplementedException;
  void fax(Document d) throws ExecutionControl.NotImplementedException;
}
