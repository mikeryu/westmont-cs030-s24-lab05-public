/**
 * Westmont College Spring 2024
 * CS 030 Project C
 *
 * @author Emiritus Professor Kurt Mammen (Cal Poly SLO, Retired)
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 * @author Boaty McBoatface bmcboatface@westmont.edu TODO: replace this with your info.
 */

public class Naughty {
  public void thrower(int index) {
    // run method chosen
    switch (index) {
      case 0:
        System.out.println("EXPECT: NO EXCEPTION");
        break;
      case 1:
        System.out.println("EXPECT: NullPointerException");
        // TODO: Method call.
        break;
      case 2:
        System.out.println("EXPECT: ClassCastException");
        // TODO: Method call.
        break;
      case 3:
        System.out.println("EXPECT: " +
            "ArrayIndexOutOfBoundsException");
        // TODO: Method call.
        break;
      case 4:
        System.out.println("EXPECT: CheckedException");
        // TODO: Method call.
        break;
      case 5:
        System.out.println("EXPECT: UncheckedException");
        // TODO: Method call.
        break;
      case -1:
        System.out.println("Terminating");
        break;
      default:
        System.out.println("Method corresponding to "
            + index + " DNE.");
    }
  }

  private void causeNullPointerException() {
    // TODO: Cause a NullPointerException.
  }

  // throwing class cast exception
  private void causeClassCastException() {
    // TODO: Cause a ClassCastException.
  }

  // throwing array index out of bounds exception
  private void causeArrayIndexOutOfBoundsException() {
    // TODO: Cause a ArrayOutOfBoundsIndexException.
  }

  // throwing checked exception
  private void throwCheckedException() {
    // TODO: Throw CheckedException you created.
  }

  // throwing unchecked exception
  private void throwUncheckedException() {
    // TODO: Throw UncheckedException you created.
  }
}