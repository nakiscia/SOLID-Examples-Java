package InterfaceSegregation.AntiPatern;

public class MultiFunctionalPrinter implements Machine {
  @Override
  public void print(Document d) {
    // This machine can print
  }

  @Override
  public void scan(Document d) {
    // This machine can scan
  }

  @Override
  public void fax(Document d) {
    // This machine can fax
  }
}
