/* James Post
 * CSCI 212-22D
 * This main program calls 3 methods to read from a file line by line,
 * store the strings in a String, and two WordList objects, and create a GUI
 * to display the original text, an unsorted WordList and a sorted WordList.
 */
public class Project2 {
   // declare/instantiate static variables/objects to use throughout program
   static String filename = "input.txt";
   static String paragraph = new String();
   static UnsortedWordList us = new UnsortedWordList();
   static SortedWordList s = new SortedWordList();

   // main uses readFromFile to store lines, and initializes/prints to GUI
   public static void main(String[] args) {
      Project2 project2 = new Project2();
      project2.readFromFile();
      WordGUI myGUI = new WordGUI();
      myGUI.initialize();
      myGUI.print(myGUI.myFrame, paragraph);
   } // main

   // readFromFile stores lines in a wordArray and sortArray and calls the append
   // and add methods to store in unsorted and sorted WordLists
   public void readFromFile() {
      TextFileInput file = new TextFileInput(filename);
      String line = file.readLine();
      while (line != null) {
         paragraph += line + "\n";
         // split line using delimiter " " to separate words, store in sortArray
         String[] sortArray = line.split(" ");
         for (int i = 0; i < sortArray.length; i++) {
            us.append(sortArray[i]);
         }
         for (int i = 0; i < sortArray.length; i++) {
            s.add(sortArray[i]);
         }
         line = file.readLine();
      }
   } // readFromFile
}
