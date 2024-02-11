/**
 * Westmont College Spring 2024
 * CS 030 Project C
 *
 * @author Emiritus Professor Kurt Mammen (Cal Poly SLO, Retired)
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 * @author Boaty McBoatface bmcboatface@westmont.edu TODO: replace this with your info.
 */

import java.util.*;

public class ExceptionDriver {
  public static void main(String[] args) {
    Naughty naughty = new Naughty();
    Scanner sc = new Scanner(System.in);
    int selection = 0;

    printMenu();
    do {
      try {
        System.out.print("\nWhich option (0-5, or -1 to quit)? ");

        selection = Integer.parseInt(sc.nextLine());
        naughty.thrower(selection);
      } catch (Throwable e) {
        // TODO: Replace this catch block with a set of specific catch blocks.
      }
    } while (selection != -1);
  }

  private static void printMenu() {
    System.out.println("Options for exceptions:\n");
    System.out.printf("  %d. %s\n  %d. %s\n  %d. %s\n  %d. %s\n  %d. %s\n  %d. %s\n",
        0, "Throw no exception",
        1, "Throw & catch NullPointerException",
        2, "Throw & catch ClassCastException",
        3, "Throw & catch ArrayIndexOutOfBoundsException",
        4, "Throw & catch CheckedException",
        5, "Throw & catch UncheckedException");
  }
}