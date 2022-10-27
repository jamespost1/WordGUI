/* James Post
 * CSCI 212-22D
 * This WordGUI class extends JFrame and contains two methods to initialize a
 * JFrame with a grid layout of 1 row and 3 columns and print a JFrame by appending
 * from the UnsortedWordList and SortedWordList data variables.
 */
import javax.swing.*;
import java.awt.*;

public class WordGUI extends JFrame {
   public JFrame myFrame;

   // initializes JFrame
   public void initialize() {
      myFrame = new WordGUI();
      myFrame.setSize(1000, 500);
      myFrame.setLocation(100, 100);
      myFrame.setTitle("WordGUI");
      // sets a grid layout of 1 row and 3 columns
      myFrame.setLayout(new GridLayout(1, 3));
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.setVisible(true);
   } // initialize

   // creates containers to store text areas where data is appended from the WordLists
   public void print(JFrame jf, String text) {
      Container myContentPane = jf.getContentPane();
      TextArea myTextArea = new TextArea();
      TextArea myUnsortedArea = new TextArea();
      TextArea mySortedArea = new TextArea();
      myContentPane.add(myTextArea);
      myContentPane.add(myUnsortedArea);
      myContentPane.add(mySortedArea);
      myTextArea.append(text + "\n");
      WordNode unsorted = Project2.us.first.next;
      // iterate through unsorted WordList, append each string data
      while (unsorted != null) {
         myUnsortedArea.append(unsorted.data + "\n");
         unsorted = unsorted.next;
      }
      WordNode sorted = Project2.s.first.next;
      // iterate and append each string data from WordList
      while (sorted != null) {
         mySortedArea.append(sorted.data + "\n");
         sorted = sorted.next;
      }
      jf.setVisible(true);
   } // print
} // WordGUI
