package LiskovSubstitutionPrincple.AntiPatern;

public class Square extends Rectangle {

  public Square() {}

  public Square(int size) {
    width = this.height = size;
  }

  // Since height and width equals in the Square
  // We override the setHeight and setWidth methods.
  // This is how we violate the Liskov Substitution Princple.
  // LSP suggest that a subclass should be able to replace its base class.
  // Since Square is a special Rectangle which height and width must be equal,
  // it shall not be replaceable with its base class.
  @Override
  public void setHeight(int height) {
    super.setHeight(height);
    super.setWidth(height);
  }

  @Override
  public void setWidth(int width) {
    super.setWidth(width);
    super.setHeight(width);
  }
}
