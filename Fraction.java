//I worked on this by myself with a little help from my teacher
import java.io.PrintWriter;

public class Fraction {

  // instance varibles

  private int num; // numerator
  private int denom; // denominator

  // initialize the Fraction to zero if no args are passed
  // constructor method

  public Fraction() {
    num = 0;
    denom = 1;
  }

  // initialize the Fraction to the given integer
  // construcotr method

  public Fraction(int whole) {
    num = whole;
    denom = 1;
  }

  // initialize the Fraction with the given numerator and denominator
  // construcotr method
  public Fraction(int n, int d) {
    num = n;
    denom = d;
  }

  // multiply the invoking object by the parameter and return the product
  // mutator method/acessor method
  public Fraction mult(Fraction multit) {
    Fraction product = new Fraction();
    product.num = num * multit.num;
    product.denom = denom * multit.denom;
    return product;
  }

  // add the invoking object and the parameter and return the sum
  // mutator method/acessor method

  public Fraction add(Fraction addit) {
    Fraction sum = new Fraction();
    int newdenom = denom * addit.denom;
    sum.denom = newdenom;
    sum.num = num * addit.denom + addit.num * denom;
    return sum;
  }

  // add the invoking object and the parameter and return the quotient
  // mutator method/acessor method

  public Fraction div(Fraction divit) {
    Fraction quotient = new Fraction();
    quotient.num = num * divit.denom;
    quotient.denom = denom * divit.num;
    return quotient;
  }

  // add the invoking object and the parameter and return the difference
  // mutator method/acessor method

  public Fraction min(Fraction minit) {
    Fraction difference = new Fraction();
    int newdenom = denom * minit.denom;
    difference.denom = newdenom;
    difference.num = num * minit.denom - minit.num * denom;
    return difference;
  }

  // print a Fraction to the given output device
  // acessor method
  public void printFrac(PrintWriter outdev) {
    outdev.print(num + "/" + denom);
  }

}
