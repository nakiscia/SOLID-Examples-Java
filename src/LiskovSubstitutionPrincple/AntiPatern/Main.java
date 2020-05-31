package LiskovSubstitutionPrincple.AntiPatern;

public class Main {

  public static void main(String[] args) {

    Rectangle rectangle = new Rectangle(10, 2);
    calculateOfAreaHeightTen(rectangle);

    Rectangle square = new Square(5);
    calculateOfAreaHeightTen(square);
  }

  // Lets break its robustness
  // This method works fine with Rectangle but when it comes to use square
  // it breaks and violating the LSP.
  // For the LSP, this method should works correctly for Rectangle and
  // derived class of Rectangle.
  static void calculateOfAreaHeightTen(Rectangle r)
  {
     int width = r.getWidth();
     r.setHeight(10);
    System.out.println("Area should be : "+ width* 10);

    System.out.println("Returned : "+r.calculateTheArea());
  }
}
