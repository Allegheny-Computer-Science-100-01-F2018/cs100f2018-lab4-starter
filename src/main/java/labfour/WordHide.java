package labfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;


/** This class has a method that implements steganography method.
 *
 * <p>Bugs: This program has no known bugs
 *
 * @author Janyl Jumadinova
 */

public class WordHide {

  /** The main entry point for WordHide.
   *  The source code inside of this method will be executed when the program is
   *  run in the command-line. The program will hide user's input inside
   *  a word grid of 20 by 20.
   *
   **/
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Janyl Jumadinova " + new Date());
    // declare the starting file and scanner
    File wordInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      wordInputsFile = new File("input/wordhide_inputs.txt");
      scanner = new Scanner(wordInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen word

    // Step Two: convert to upper case

    // Step Three: Declaring at least ten new String variables
    // Use your developed strategy for assigning these variables values

    // Step Four: Use at least 12 println statements to display the 20 x 20 grid
        
    // Step Five: Display a final thank you message
  }

}
