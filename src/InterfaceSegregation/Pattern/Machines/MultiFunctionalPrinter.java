package InterfaceSegregation.Pattern.Machines;

import InterfaceSegregation.Pattern.Document.Document;
import InterfaceSegregation.Pattern.Interfaces.MultiFunctionalMachine;

// We simply categorize the interfaces into small pieces and use it
public class MultiFunctionalPrinter implements MultiFunctionalMachine {

  // We can use Decorater design pattern here...

  @Override
  public void print(Document d) {

  }

  @Override
  public void scan(Document d) {

  }
}
